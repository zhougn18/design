package com.xiao.strategy;

public class Cat {
    private Integer weight;
    private String name;
    private Integer height;

    public Cat(Integer weight, String name, Integer height) {
        this.weight = weight;
        this.name = name;
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
