package com.xiao.state.v2;


/**
 * 状态模式  把状态抽成一个接口 不同的状态做不同的事
 */
public interface State  {
    void eat(Behavior behavior);
}
