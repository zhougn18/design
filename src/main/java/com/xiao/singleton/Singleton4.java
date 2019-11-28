package com.xiao.singleton;

/**
 * 静态内部类方式 懒加载  饿汉式
 * 外部类加载的时候不会立即加载 内部类
 */
public class Singleton4 {
    private Singleton4(){};
    private static class SingletonHolder{
       private static final Singleton4  instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
}
