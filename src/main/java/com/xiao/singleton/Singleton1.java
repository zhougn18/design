package com.xiao.singleton;

/**
 * 饿汉式
 * 类加载到内存后，只有一个对象    类只要加载就会实例化
 */
public class Singleton1 {
    private Singleton1(){}
    private static final Singleton1 singleton = new Singleton1();
    public static Singleton1 getInstance(){
        return singleton;
    }
}
