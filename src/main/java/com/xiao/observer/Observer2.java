package com.xiao.observer;

/**
 * 具体的观察者
 */
public class Observer2 implements Observer {
    Subject subject;
    public Observer2(Subject subject) {
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public void handle(Subject subject) {
        System.out.println("Observer2接收到"+subject.getState());
    }
}
