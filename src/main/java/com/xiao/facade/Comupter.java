package com.xiao.facade;

/**
 * facade门面模式 把复杂的系统  提供一个简单的入口   客户端不需要知道内部是怎么实现的  客户端不需要和内部打交到
 * 比如 一个开关电脑的功能  需要开关键盘，鼠标，内存等操作   只需要提供一个关电脑的功能，客户端不需要知道电脑内部是怎么开关的
 * 在开关电脑里去 封装开关键盘，鼠标，内存等操作   （电脑开关 相当于门面模式）
 */
public class Comupter {
    public void start(){
        KeyBoard keyBoard = new KeyBoard();
        Memory memory = new Memory();
        Mouse mouse = new Mouse();
        keyBoard.start();
        memory.start();
        mouse.start();
    }

    public void shutDown(){
        KeyBoard keyBoard = new KeyBoard();
        Memory memory = new Memory();
        Mouse mouse = new Mouse();
        keyBoard.shutDown();
        memory.shutDown();
        mouse.shutDown();
    }
}
