package com.xiao.bridge.v2;

public class IpadComputer extends Computer {
    public IpadComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void showName() {
        System.out.println(super.brand.showName()+"ipd");
    }
}
