package com.xiao.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class RentHouseMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 生成的代理对象  该类是目标类的子类
     * @param method  原目标方法
     * @param objects  方法参数
     * @param methodProxy 生成的代理方法
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理**验证身份.....");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib动态代理**交中介费.....");
        return o1;
    }
}
