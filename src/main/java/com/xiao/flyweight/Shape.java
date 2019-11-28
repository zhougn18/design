package com.xiao.flyweight;

/**
 * 享元模式   对象共享  简单理解就是对象存在 就直接用 不存在就创建一个对象使用
 * 类似单利模式   不同的是  单利模式一个类在内存中只有一个对象  而享元模式一个类在内存中有多个对象
 * 各种池（线程池，数据库连接池等）的实现 就是享元模式   有就用 没有就创建一个
 * 定义抽象享元接口
 */
public interface Shape {
    void draw();
}