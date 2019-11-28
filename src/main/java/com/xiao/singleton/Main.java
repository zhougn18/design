package com.xiao.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton6();

    }

    public  static void Singleton1(){
        Singleton1 i1 = Singleton1.getInstance();
        Singleton1 i2 = Singleton1.getInstance();
        System.out.println(i1.hashCode() + "----------" + i2.hashCode());
        System.out.println(i1.hashCode() == i2.hashCode());
    }

    public static void Singleton2() {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton2.getInstance().hashCode());
            }).start();
        }
    }

    public static void Singleton3() {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }
    }

    public static void Singleton4() {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton4.getInstance().hashCode());
            }).start();
        }
    }


    public static void Singleton5() {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton5.getInstance().hashCode());
            }).start();
        }
    }

    public static void Singleton6() {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton5.INSTANCE.hashCode());
            }).start();
        }
    }
}
