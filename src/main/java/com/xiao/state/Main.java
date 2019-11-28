package com.xiao.state;

import com.xiao.state.v1.Behavior;

public class Main {
    public static void main(String[] args) {
        testNotState();
        System.out.println("-----------");
        testState();
    }
    public static void testNotState(){
        Behavior behavior = new Behavior();
        behavior.setTime(7);
        behavior.eat();
    }

    public static void testState(){
        com.xiao.state.v2.Behavior behavior= new  com.xiao.state.v2.Behavior(7);
        behavior.eat();
    }
}
