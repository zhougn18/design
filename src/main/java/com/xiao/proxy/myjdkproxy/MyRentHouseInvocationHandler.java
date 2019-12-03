package com.xiao.proxy.myjdkproxy;

import java.lang.reflect.Method;

public class MyRentHouseInvocationHandler implements MyInvocationHander {
    private Object target;
    public MyRentHouseInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------------");
        Object invoke = method.invoke(target, args);
        System.out.println("*****************");
        return invoke;
    }
}
