package com.xiao.visitor.v2;

public class StudentVistor implements Visitor {
    double price=0.0;
    @Override
    public void visitCpu(Cpu cpu) {
        price +=cpu.getPrice();
    }

    @Override
    public void visitMemory(Memory memory) {
        price += memory.getPrice();
    }

    @Override
    public void visitMouse(Mouse mouse) {
        price +=mouse.getPrice();
    }

    public double getPrice() {
        return price;
    }
}
