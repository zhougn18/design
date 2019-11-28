package com.xiao.visitor.v1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        double price = computer.getPrice("company");
        System.out.println(price);
    }
}
