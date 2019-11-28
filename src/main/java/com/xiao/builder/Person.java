package com.xiao.builder;

/**
 * builder模式 建造者模式
 * 当一个类有好多属性时  创建一个对象要传好多参数  这时可以用建造者模式
 * 分步骤一点一点把对象创建出来
 */
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private Double height;
    private Double weight;
    private Address address;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class PersonBuilder{
        Person person = new Person();
        public  PersonBuilder basicInfo(Integer id,String name,Integer age) {
            person.setId(id);
            person.setName(name);
            person.setAge(age);
            return this;
        }
        public  PersonBuilder height(Double height) {
            person.setHeight(height);
            return this;
        }
        public  PersonBuilder weight(Double weight) {
            person.setWeight(weight);
            return this;
        }

        public PersonBuilder location(String stress ,String xiaoqu) {
            Address address= new Address(stress,xiaoqu);
            person.setAddress(address);
            return this;
        }
        public Person build(){
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", address=" + address +
                '}';
    }
}
