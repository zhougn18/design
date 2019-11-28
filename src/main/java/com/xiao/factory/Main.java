package com.xiao.factory;

import com.xiao.factory.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        test(new HPComputerFactory());
        System.out.println("-----------------------------------");
        test(new LComputerFactory());
    }

    public static void test(AbstractComputerFactory factory){
        KeyBoard keyBoard = factory.getKeyBoard();
        keyBoard.printName();
        Memory memory = factory.getMemory();
        memory.printName();
        Mouse mouse = factory.getMouse();
        mouse.printName();
    }
}
