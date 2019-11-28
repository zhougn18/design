package com.xiao.factory.abstractfactory;

/**
 * 抽象工厂 是对一个产品簇的封装
 * 简单理解 就是这个工厂里可以创建多个对象
 * 工厂方法 是抽象工厂的一个特例   工厂方法中只创建一个对象
 * 如 电脑由鼠标，键盘，内存等组成  这个工厂可以生产多个对象
 */
public abstract class AbstractComputerFactory {
   public abstract KeyBoard getKeyBoard();
   public abstract Memory getMemory();
   public abstract Mouse getMouse();
}
