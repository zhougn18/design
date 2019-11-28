package com.xiao.visitor.v2;
public interface Visitor {
    void visitCpu(Cpu cpu);
    void visitMemory(Memory memory);
    void visitMouse(Mouse mouse);
}
