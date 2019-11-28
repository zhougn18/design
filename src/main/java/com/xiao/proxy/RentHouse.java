package com.xiao.proxy;

/**
 * 目标对象
 */
public class RentHouse implements  IRentHouse {
    @Override
    public void rentHouse(Person person) {
        System.out.println("租客："+person.getName()+"  租房成功");
    }
}
