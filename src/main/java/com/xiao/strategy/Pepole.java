package com.xiao.strategy;

public class Pepole {
    private String name;
    private Integer age;

    public Pepole(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pepole{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
