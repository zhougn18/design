package com.xiao.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者
 * 管理所有的备忘录   需要恢复状态时 客户端从备忘录管理者中找到那一时刻的备忘录（状态）
 */
public class Caretaker {
    List<Memento> mementos = new ArrayList<>();

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

}
