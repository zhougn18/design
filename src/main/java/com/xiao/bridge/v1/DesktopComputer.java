package com.xiao.bridge.v1;

public class DesktopComputer implements Computer {
    @Override
    public void showName() {
        System.out.println("台式电脑");
    }
}
