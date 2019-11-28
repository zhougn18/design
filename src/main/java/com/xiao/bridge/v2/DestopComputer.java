package com.xiao.bridge.v2;

public class DestopComputer extends Computer {

    public DestopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void showName() {
        System.out.println(super.brand.showName()+"台式电脑");
    }
}
