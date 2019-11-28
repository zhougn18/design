package com.xiao.proxy;

import com.xiao.proxy.cglib.CglibProxyRentHouse;
import com.xiao.proxy.jdk.JdkProxyRentHouse;
import com.xiao.proxy.statics.StaticProxyRentHouse;
import net.sf.cglib.core.DebuggingClassWriter;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("张三", 20);
        testStaticProxy(p);
        testJdkProxy(p);
        TestCglibProsy(p);
    }
    public static void testStaticProxy(Person person) {
       IRentHouse target = new RentHouse();
       IRentHouse rentHouse = new StaticProxyRentHouse(target);
       rentHouse.rentHouse(person);

    }

    public static void testJdkProxy(Person person) {
        //生成$Proxy0.class字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IRentHouse instance = JdkProxyRentHouse.getProxyInstance();
        instance.rentHouse(person);
    }

    public static void TestCglibProsy(Person person) {
        //生成代理类的字节码文件
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"C:\\a");
        IRentHouse instance = CglibProxyRentHouse.getInstance();
        instance.rentHouse(person);
    }
}
