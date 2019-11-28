package com.xiao.prototype.v2;

public class Address implements  Cloneable{
    private String street;
    private Integer room;

    public Address(String street, Integer room) {
        this.street = street;
        this.room = room;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return street+" ------- "+room;
    }
}
