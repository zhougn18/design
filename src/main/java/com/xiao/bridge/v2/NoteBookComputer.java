package com.xiao.bridge.v2;

public class NoteBookComputer extends Computer {

    protected NoteBookComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void showName() {
        System.out.println(super.brand.showName()+"笔记本电脑");
    }
}
