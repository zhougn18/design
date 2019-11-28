package com.xiao.visitor.v2;

public class CompanyVistor implements Visitor {
    double price=0.0;
    @Override
    public void visitCpu(Cpu cpu) {
        price +=cpu.getPrice()*0.2;
    }

    @Override
    public void visitMemory(Memory memory) {
        price += memory.getPrice()*0.8;
    }

    @Override
    public void visitMouse(Mouse mouse) {
        price +=mouse.getPrice()*0.5;
    }

    public double getPrice() {
        return price;
    }
}
