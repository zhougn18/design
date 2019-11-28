package com.xiao.memento;

/**
 * 发起方 备忘录就是为了记录发起方的状态（操作）
 */
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    /**
     * 当需要备份（备忘录）时  创建备忘录  记录这个对象这一时刻的状态
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    public void setState(String state) {
        this.state = state;
    }
    public void show() {
        System.out.println("state = " + state);
    }
}
