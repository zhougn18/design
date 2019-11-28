package com.xiao.singleton;
/**
 * 懒汉式  同步代码块
 * 类加载进内存中 不会立即实例化  用到再实例化
 */
public class Singleton3 {
    private Singleton3(){}
    //volatile 为了避免指令重排的问题
    private static volatile Singleton3 instance = null;
    public static Singleton3 getInstance(){
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
