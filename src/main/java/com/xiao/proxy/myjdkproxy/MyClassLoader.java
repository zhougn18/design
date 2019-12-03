package com.xiao.proxy.myjdkproxy;

import java.io.*;

/**
 * 自定义类加载器  重写findClass  通过指定字节码文件地址找到class字节码文件
 * 把class字节码文件转换成字节数字  调用defineClass  转换成jvm能识别的class对象
 */
public class MyClassLoader extends ClassLoader{
    public MyClassLoader(){}

    /**
     * 通过指定字节码文件地址找到class字节码文件
     * @param name  代理类 类名称
     * @return
     */
    @Override
    protected Class<?> findClass(String name) {
        //生成代理类的 全限定名  包名+类名
        String className = MyProxy.class.getPackage().getName() + "." + name;
        //生成代理类的字节码文件路径
        String clazzName=MyProxy.class.getResource("").getPath() + name + ".class";
        File classFile = new File(clazzName);
        FileInputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(classFile);
            outputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            //调用defineClass 把字节流转换成jvm认识的class对象
            return defineClass(className , outputStream.toByteArray(), 0, outputStream.size());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
