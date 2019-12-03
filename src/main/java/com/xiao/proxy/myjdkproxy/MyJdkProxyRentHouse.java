package com.xiao.proxy.myjdkproxy;

import com.xiao.proxy.IRentHouse;
import com.xiao.proxy.RentHouse;

import java.io.IOException;

public class MyJdkProxyRentHouse {
    public static IRentHouse getInstance() throws Exception {
        RentHouse rentHouse = new RentHouse();
        return (IRentHouse) MyProxy.newProxyInstance(new MyClassLoader(), rentHouse.getClass().getInterfaces(), new MyRentHouseInvocationHandler(rentHouse
        ));
    }
}
