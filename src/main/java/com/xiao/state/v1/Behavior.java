package com.xiao.state.v1;

/**
 * 状态模式  根据不同的状态  做不同的事情
 * Behavior类中的time 相当于状态  根据 time的不同 eat方法有不同的操作
 * 如果再增加time  还要修改eat内的方法
 * 根据不同的状态  做不同的事可以采用状态模式
 */
public class Behavior {
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void eat(){
        if (time > 6 && time < 8) {
            System.out.println("吃早饭");
        } else if (time > 11 && time < 13) {
            System.out.println("吃午饭");
        }else if (time > 18 && time < 20) {
            System.out.println("吃午饭");
        }else{
            System.out.println("不是吃饭时间");
        }
    }
}
