package com.xiao.template;

public class Main {
    public static void main(String[] args) {
        Game game1 = new HGame();
        game1.play();
        System.out.println("-----------");
        Game game2 = new WGame();
        game2.play();
    }
}
