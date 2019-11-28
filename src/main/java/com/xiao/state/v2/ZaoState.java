package com.xiao.state.v2;

public class ZaoState implements  State {

    @Override
    public void eat(Behavior behavior) {
        if (behavior.getTime() > 6 && behavior.getTime() < 8) {
            System.out.println("吃早饭");
        }else{
            behavior.setState(new WuState());
            behavior.eat();
        }

    }
}
