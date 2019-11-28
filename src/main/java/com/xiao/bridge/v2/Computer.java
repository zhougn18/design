package com.xiao.bridge.v2;

/**
 * 把复杂的类继承按照电脑和品牌两个维度进行拆分
 * 再新增电脑类型 和品牌 不用新增好多类  再电脑类里放一个品牌对象的引用
 * 新增某一个维度的类 不担心另一个维度的变化
 * 使用的时候 传对应得品牌就可以
 * 桥接模式 处理多层继承结构 , 处理多维度变化的场景 , 将各个维度设计成独立的继承结构 ,使各个维度可以独立的扩展在抽象层建立关联
 */
public abstract class Computer {
    protected Brand brand;
    protected Computer(Brand brand) {
        this.brand = brand;
    }
   public abstract void showName();
}
