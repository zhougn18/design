package com.xiao.visitor;

import com.xiao.visitor.v1.Computer;
import com.xiao.visitor.v2.StudentVistor;

public class Main {
    public static void main(String[] args) {
        testNotVisitor();
        System.out.println("-------------------------");
        testVisitor();
    }
    //非visitor模式
    public static void testNotVisitor() {
        Computer computer = new Computer();
        double price = computer.getPrice("student");
        System.out.println(price);
    }
    //visitor模式
    public static void testVisitor() {
        StudentVistor visitor = new StudentVistor();
        com.xiao.visitor.v2.Computer computer = new com.xiao.visitor.v2.Computer();
        computer.acccept(visitor);
        System.out.println(visitor.getPrice());
    }
}
