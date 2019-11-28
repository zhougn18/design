package com.xiao.state.v2;


public class WuState implements  State {

    @Override
    public void eat(Behavior behavior){
         if (behavior.getTime() > 11 && behavior.getTime() < 13) {
            System.out.println("吃午饭");
        }else{
            behavior.setState(new WanState());
            behavior.eat();
        }
    }
}
