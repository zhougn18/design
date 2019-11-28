package com.xiao.prototype;

import com.xiao.prototype.v1.Address;
import com.xiao.prototype.v1.Person;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        testShenClon();

    }

    // 测试浅克隆
   public static void testQianClon() throws CloneNotSupportedException {
       Address address = new Address("bj", 1);
       Person person1 = new Person("张三",20,address);
       Person person2= (Person) person1.clone();
       /**
        * 因为是浅克隆  所以person1和person2中的address都指向同一个引用
        * 不管改变person1中的address对象的属性值还是改变person2中的address对象得属性值  两个对象中的address都是同一个
        * 这样两个对象的耦合性太强
        */
       person1.getAddress().setStreet("aa");
       System.out.println(person1 == person2);
       System.out.println(person1.getAddress() == person2.getAddress());
       System.out.println("p1  "+person1.getAddress()+"***** p2  "+person2.getAddress());
    }
    //测试深克隆
    public static void testShenClon() throws CloneNotSupportedException {
        com.xiao.prototype.v2.Address address = new com.xiao.prototype.v2.Address("bj", 1);
        com.xiao.prototype.v2.Person person1 = new com.xiao.prototype.v2.Person("张三",20,address);
        com.xiao.prototype.v2.Person person2= (com.xiao.prototype.v2.Person) person1.clone();
        person1.getAddress().setStreet("aa");
        System.out.println(person1 == person2);
        System.out.println(person1.getAddress() == person2.getAddress());
        System.out.println("p1  "+person1.getAddress()+"***** p2  "+person2.getAddress());
    }
}
