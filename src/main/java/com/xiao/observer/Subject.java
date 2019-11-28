package com.xiao.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式  被观察者发生变化  它的所有观察者都会接收到通知 类型发布订阅模式  生产者产生消息  所有订阅者都能收到消息
 * 事件源对象中 有一个所有观察者的集合
 * Subject 事件源对象 （被观察对象）
 * 抽象的事件源对象
 */
public class Subject {
    //这个subject 事件源对象的所有观察者
    private List<Observer> observers = new ArrayList<>();
    //状态 当状态发生变化时  发送给所有观察者
    private Integer state;
    //添加观察者
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    //移除观察者
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    //通知所有订阅者
    public void notifyToAll() {
        observers.forEach(o->{
            //让每个观察者 自己实现各自的业务
            o.handle(this);
        });
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyToAll();
    }
}
