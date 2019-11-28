package com.xiao.singleton;

/**
 * 懒汉式  静态同步方法 效率低
 * 类加载进内存中 不会立即实例化  用到再实例化
 */
public class Singleton2 {
    private Singleton2(){};
    private static  Singleton2 instance ;
    public static synchronized Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
