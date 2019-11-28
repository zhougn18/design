package com.xiao.visitor.v2;

/**
 * visitor模式   元素中（如Cpu,Mouse,Memory，Computer）可以接受访问者
 * 结构稳定的 易变得操作 交给同步的访问者去做
 * 结构稳定 比如 computer里只有cpu，mouse，memory  不会轻易的给改变computer里面的属性
 * 易变操作 比如 学生买computer 不打折  公司批量采购computer 打8折 ，其他渠道买computer打5折 等等   打折的操作交给不同的访问者
 *
 * 关键词：访问者  如不同的visitor（学生，公司）
 * 被访问者（元素） 如Cpu,Mouse,Memory
 * 元素群  Computer    Computer里有多个元素
 *
 * 访问者模式的作用：对【元素】、【访问者】和【对元素的操作】进行单独抽象和封装，一旦这些【访问者】的增加或者是【对元素的操作】发生变化，不需要修改【元素】。
 * 简单理解就是 如果访问者增加或减少 只需要增加新的类实现visitor接口
 * 如果新增加的访问者对元素中的属性有不同的操作  只需要在访问者中处理就可以
 * 不需要修改元素的值  比如 Cpu价格就是150   不需要修改Cpu元素的属性。
 */
public class Computer {
    private Cpu cpu = new Cpu();
    private Mouse mouse = new Mouse();
    private Memory memory = new Memory();

    public void acccept(Visitor v) {
        this.cpu.accpet(v);
        this.mouse.accpet(v);
        this.memory.accpet(v);
    }

}
