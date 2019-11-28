package com.xiao.template;

/**
 * 模板方法
 * 比如一个固定的执行步骤  运算或执行顺序不会变化 但是每一个步骤不同的事务都有 不同的操作
 * 比如 一个游戏  再玩的过程中 都有初始化，开始，结束的过程
 * 但是不同游戏  初始化，开始，结束里执行的操作可能都不同
 */
public abstract class Game {
    abstract public void init();
    abstract public void start();
    abstract public void end();

    public void play(){
        init();
        start();
        end();
    }
}
