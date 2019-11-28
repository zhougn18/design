package com.xiao.visitor.v2;

public class Cpu extends ComputPart{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitCpu(this);
    }
    @Override
    public double getPrice() {
        return 150;
    }
}
