package com.xiao.iterator;

public interface MyCollection {
    void add(Object object);

    int getSize();

    Object get(int index);

    MyIterator iterator();
}
