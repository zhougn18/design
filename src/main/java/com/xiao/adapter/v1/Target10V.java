package com.xiao.adapter.v1;

/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 比如 手机是充电是10V  家里电源是220V   这时不能直接用家里电源直接给手机充电  可以用适配器把220V转换成10V
 * 10V电压是  目标
 *220V 是要被适配的
 *把220V转成10V 的 就是适配器
 */
public interface Target10V {
    //充5V电
    void chongdian5V();
}
