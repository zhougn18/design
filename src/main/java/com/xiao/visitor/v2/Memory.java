package com.xiao.visitor.v2;

public class Memory extends ComputPart{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitMemory(this);
    }
    @Override
    public double getPrice() {
        return 350;
    }
}
