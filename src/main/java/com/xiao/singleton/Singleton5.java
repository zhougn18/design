package com.xiao.singleton;

/**
 * 饿汉式
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum  Singleton5 {
    INSTANCE;
    public static Singleton5 getInstance(){
        return INSTANCE;
    }
}
