package com.xiao.facade;

/**
 * 客户端调用 电脑（门面）去开关机
 */
public class UserCilent {
    public static void main(String[] args) {
        Comupter comupter = new Comupter();
        comupter.start();
        System.out.println("----------------------");
        comupter.shutDown();
    }
}
