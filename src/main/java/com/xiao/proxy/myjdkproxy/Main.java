package com.xiao.proxy.myjdkproxy;

import com.xiao.proxy.IRentHouse;
import com.xiao.proxy.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        IRentHouse instance = MyJdkProxyRentHouse.getInstance();
        instance.rentHouse(new Person("z6",2));
    }
}
