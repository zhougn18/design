package com.xiao.proxy.myjdkproxy;

import java.lang.reflect.Method;

public interface MyInvocationHander {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
