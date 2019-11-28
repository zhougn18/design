package com.xiao.visitor.v2;

public class Mouse extends ComputPart{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitMouse(this);
    }
    @Override
    public double getPrice() {
        return 50;
    }
}
