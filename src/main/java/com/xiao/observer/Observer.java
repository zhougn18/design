package com.xiao.observer;

/**
 * 抽象出来的观察者
 */
public interface Observer {
    //观察者接受到事件源通知时的具体操作
    void handle(Subject subject);
}
