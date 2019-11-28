package com.xiao.adapter.v1;

public class Main {
    public static void main(String[] args) {
        Adaptee220V adaptee220V = new Adaptee220V();
        Adapter adapter = new Adapter(adaptee220V);
        adapter.chongdian5V();
    }
}
