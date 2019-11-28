package com.xiao.adapter.v1;

/**
 * 现在假设只有220V电压  想给10V手机充电
 * 可以通过适配器转换
 */
public class Adapter implements Target10V {
    //适配器中持有220v的引用
    private Adaptee220V adaptee220V;

    public Adapter(Adaptee220V adaptee220V) {
        this.adaptee220V = adaptee220V;
    }

    @Override
    public void chongdian5V() {
        adaptee220V.chongdian220V();
    }
}
