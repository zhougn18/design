package com.xiao.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().basicInfo(1, "张三", 20)
                .weight(50.1).height(180.0).location("XX","YY").build();
        System.out.println(person);
    }
}
