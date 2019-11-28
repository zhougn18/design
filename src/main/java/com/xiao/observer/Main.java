package com.xiao.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer o1 = new Observer1(subject);
        Observer o2 = new Observer2(subject);
        //模拟移除订阅
        subject.removeObserver(o2);
        //当事件源对象的状态发生变化时   通知所有观察者
        subject.setState(9);
    }
}
