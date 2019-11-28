package com.xiao.prototype.v1;

/**
 * 原型模式 是用于创建重复的对象  要克隆对象要实现cloneable接口
 * 浅克隆  如果通过创建Person对象克隆出来的对象  两个对象中的address 属性都指向同一个地址
 * 改变其中一个address对象中的属性时 另一个对象都会跟着变化  耦合度高
 */
public class Person implements Cloneable{
    private String name;
    private Integer age;
    private Address address;

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
