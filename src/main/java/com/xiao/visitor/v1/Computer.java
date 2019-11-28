package com.xiao.visitor.v1;

/**
 * 不用visitor模式
 * 根据不同的人 买电脑会返回不同的价格  如果再有新类型的人来购买电脑还需要修改getPrice方法
 */
public class Computer {
    private Cpu cpu = new Cpu();
    private Mouse mouse = new Mouse();
    private Memory memory = new Memory();

    public double getPrice(String name){
        if (name == "student") {
            return cpu.getPrice()+mouse.getPrice()+memory.getPrice();
        }
        if (name == "company") {
            return cpu.getPrice()*0.2+mouse.getPrice()*0.5+memory.getPrice()*0.8;
        }
        if (name == "z") {
            return cpu.getPrice()*0.9+mouse.getPrice()*0.8+memory.getPrice()*0.9;
        }
        return 0.0;

    }
}
