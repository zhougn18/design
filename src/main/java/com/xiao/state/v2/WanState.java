package com.xiao.state.v2;

public class WanState implements  State {

    @Override
    public void eat(Behavior behavior) {
        if (behavior.getTime() > 18 && behavior.getTime() < 20) {
            System.out.println("吃晚饭");
        }else{
            System.out.println("不是吃饭时间");
        }
    }
}
