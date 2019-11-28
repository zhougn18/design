package com.xiao.decorator;

public class Main {
    public static void main(String[] args) {
        Human human = new Man();
        HumanDecorator decorator = new HumanDecorator(human);
        decorator.run();
    }
}
