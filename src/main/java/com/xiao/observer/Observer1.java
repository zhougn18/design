package com.xiao.observer;

/**
 * 具体的观察者
 */
public class Observer1 implements Observer {
    Subject subject;
    public Observer1(Subject subject) {
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public void handle(Subject subject) {
        System.out.println("Observer1接收到"+subject.getState());
    }
}
