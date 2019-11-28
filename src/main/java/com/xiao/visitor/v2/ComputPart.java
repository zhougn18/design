package com.xiao.visitor.v2;

public abstract class ComputPart {
    public abstract void accpet(Visitor visitor);
    public abstract double getPrice();
}
