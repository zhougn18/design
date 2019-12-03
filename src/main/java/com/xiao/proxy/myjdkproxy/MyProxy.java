package com.xiao.proxy.myjdkproxy;

import com.xiao.proxy.RentHouse;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyProxy {
    private static final String ln="\t\n";

    public static Object newProxyInstance(MyClassLoader loader, Class<?>[] interfaces, MyInvocationHander h) throws Exception {
        //1、生成代理类源码$proxy0.java
        String proxySrc = generSrc(interfaces);
        //2、生成的字节码文件保存到磁盘或内存
        File srcFile = saveFile(proxySrc);
        //3、把生成的$proxy0.java文件编译成$proxy0.class字节码文件
        compilerJavaFile(srcFile);
        //4、把字节码文件加载到jvm
        Class<?> proxyClazz = loader.findClass("$Proxy0");
        //获取带有MyInvocationHander参数的构造函数
        Constructor<?> constructor = proxyClazz.getDeclaredConstructor(MyInvocationHander.class);
        //5、返回代理对象  h表示实例化代理对象是  构造函数中传的值
        return constructor.newInstance(h);
    }

    private static void compilerJavaFile(File srcFile) throws IOException {
        //创建java编译对象
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //获取文件管理器对象
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        //获取指定文件夹下所有要编译的.java文件
        Iterable iterable = manager.getJavaFileObjects(srcFile);
        //创建编译任务  第一个参数 编译出错时  写到哪个文件 如果为null 编译报错输出再控制台上
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        //执行编译true编译成功 false编译失败
        Boolean call = task.call();
        manager.close();
        System.out.println("编译"+(call?"成功":"失败"));
    }

    private static File saveFile(String src) throws IOException {
        String path = MyProxy.class.getResource("").getPath();
        File file = new File(path+"\\$Proxy0.java");
        FileOutputStream stream = new FileOutputStream(file);
        stream.write(src.getBytes());
        stream.close();
        return file;
    }
    private static String generSrc(Class<?>[] interfaces) {
        StringBuilder builder = new StringBuilder("package "+MyProxy.class.getPackage().getName()+";"+ln);
        builder.append("import java.lang.reflect.Method;"+ln);
        builder.append("public final class $Proxy0 implements ");
        for (int i = 0; i < interfaces.length; i++) {
            if (i == interfaces.length - 1) {
                Class<?> inter = interfaces[i];
                builder.append(interfaces[i].getName()).append("{"+ln);
                String name = MyInvocationHander.class.getPackage().getName();
                builder.append("private "+name+".MyInvocationHander h;"+ln);
                builder.append("public $Proxy0("+name+".MyInvocationHander h) {" + ln);
                builder.append("this.h = h ;" + ln);
                builder.append("}"+ln);
                Method[] methods = inter.getMethods();
                for (int j = 0; j < methods.length; j++) {
                    Method method = methods[j];
                    builder.append("@Override" + ln);
                    builder.append(" public final "+method.getReturnType()+" rentHouse(");
                    Parameter[] parameters = method.getParameters();
                    //参数引用
                    StringBuilder paramBuilder = new StringBuilder();
                    //参数类型
                    StringBuilder paramObjectBuilder = new StringBuilder();
                    for (int x = 0; x < parameters.length; x++) {
                        paramBuilder.append("new Object[]{");
                        if (i == parameters.length - 1) {
                            builder.append(parameters[x].getType().getName() + " param" + x+" ){"+ln);
                            paramBuilder.append("param" + x+"}");
                            paramObjectBuilder.append("Class.forName(\""+parameters[x].getType().getName()+"\")");
                        }else{
                            builder.append(parameters[x].getType().getName() + " param" + x+" ,"+ln);
                            paramBuilder.append("param" + x+",");
                            paramObjectBuilder.append("Class.forName(\""+parameters[x].getType().getName()+"\"),");
                        }
                    }
                    builder.append("try {");
                    builder.append("Method m =  Class.forName(\""+inter.getName()+"\").getMethod(\""+method.getName()+"\",new Class[]{ "+paramObjectBuilder.toString()+"});"+ln);
                    builder.append("h.invoke(this,m,"+paramBuilder.toString()+");"+ln);
                    builder.append("}" + ln);
                }
            }else{
                builder.append(interfaces[i].getName()).append(",");
            }
        }
        builder.append("catch (Throwable throwable) {" + ln);
        builder.append(" throwable.printStackTrace();" + ln);
        builder.append("}"+ln);
        builder.append("}"+ln);
        builder.append("}"+ln);
        return builder.toString();
    }

    public static void main(String[] args) throws Exception {
        newProxyInstance(null, RentHouse.class.getInterfaces(), null);
    }
}
