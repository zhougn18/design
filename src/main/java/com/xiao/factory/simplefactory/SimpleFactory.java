package com.xiao.factory.simplefactory;

import com.xiao.factory.entity.Broom;
import com.xiao.factory.entity.Car;
import com.xiao.factory.entity.Moveable;

/**
 * 简单工厂  所用对象都在工厂类里创建
 * 扩展性不好 如果这个工厂要创建新的类   需要修改这个工厂
 */
public class SimpleFactory {
    public static Moveable getCar(){
        return new Car();
    }

    public static Moveable getBroom(){
        return new Broom();
    }
}
