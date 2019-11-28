package com.xiao.decorator;

/**
 * 比如 人只具有跑的功能  现在想对人(Man)这个类进行扩展  使Man这个类可以飞
 * 可以不修改原有的Man类   定义一个装饰类 对Man进行装饰  进行扩展
 */
public class HumanDecorator implements Human{
    private Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }
    @Override
    public void run() {
        human.run();
        System.out.println("fly");
    }
}
