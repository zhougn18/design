package com.xiao.prototype.v1;

public class Address {
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
    public String toString() {
        return street+" ------- "+room;
    }
}
