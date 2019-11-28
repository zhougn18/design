package com.xiao.prototype.v2;

/**
 * 原型模式 是用于创建重复的对象  要克隆对象要实现cloneable接口
 * 深克隆  如果通过创建Person对象克隆出来的对象  两个对象中的address 属性指向不是同一个地址
 * 改变其中一个address对象中的属性时 不会影响另一个对象的变化
 * 深克隆  就是Person类中的所有引用属性 都要实现cloneable接口 重写clone方法
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
        //深克隆  Person 中的所有引用属性都要实现克隆方法
        Person p= (Person) super.clone();
        p.address = (Address) address.clone();
        return p;
    }


}
