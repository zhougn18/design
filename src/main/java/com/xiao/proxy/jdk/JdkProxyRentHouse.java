package com.xiao.proxy.jdk;

import com.xiao.proxy.IRentHouse;
import com.xiao.proxy.RentHouse;

import java.lang.reflect.Proxy;

/**
 *jdk动态代理
 * jdk 动态代理 代理的是接口
 * 在程序运行时创建一个实现某些给定接口的新类($Proxy0)  就是代理类
 * 好处：动态生成代理类  当接口中新增方法时 代理类不用重写新增的方法
 * 缺点：执行目标方法时  不能灵活的再目标方法前后做不同的业务逻辑
 */
public class JdkProxyRentHouse {
    public static  IRentHouse getProxyInstance(){
        RentHouse rentHouse = new RentHouse();
        /**
         * newProxyInstance 三个参数
         * loader: 用哪个类加载器去加载代理对象  指定用加载RentHouse类的类加载器 去加载运行时生成的代理对象
         * interfaces:动态代理类需要实现的接口  代理目标对象实现了哪些接口
         * h:动态代理方法在执行时，会调用h里面的invoke方法去执行
         */
        IRentHouse o = (IRentHouse) Proxy.newProxyInstance(RentHouse.class.getClassLoader(), RentHouse.class.getInterfaces(),
                new RentHouseInvocationHandler(rentHouse));
        return o;
    }
}
