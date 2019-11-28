package com.xiao.memento;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator("01");
        //记录当前状态
        Memento memento = o.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento);
        //由于某些操作把状态变为02  可能忘记了上一个状态
        o.setState("02");
        o.show();
        //通过备忘录找到上一个状态
        Memento memento1 = caretaker.getMemento(0);
        System.out.println("备忘录的状态："+memento1.getState());
    }
}
