package com.xiao.state.v2;

public class Behavior {
    private int time;
    private State state = new ZaoState();

    public Behavior(int time) {
        this.time = time;
    }

    public void eat(){
        state.eat(this);
    }

    public void setState(State state) {
        this.state=state;
    }
    public int getTime(){
        return time;
    }
}
