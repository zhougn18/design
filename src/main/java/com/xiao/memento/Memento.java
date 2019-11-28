package com.xiao.memento;

/**
 * 备忘录模式
 * 发起方可以创建备忘录 记录当前状态
 * 备忘录管理者管理备忘录 当需要回复上一个状态时  从备忘录管理类中拿到那一时刻的备忘录 回复状态
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
