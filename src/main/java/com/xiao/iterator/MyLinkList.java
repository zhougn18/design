package com.xiao.iterator;

public class MyLinkList implements MyCollection {
    private MyNode head = null;
    private MyNode tail = null;
    private int size = 0;
    @Override
    public void add(Object object) {
        MyNode node = new MyNode(object);
        if (head == null) {
            head = node;
            tail=node;
        }
        tail.next=node;
        tail =node;
        size++;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public MyIterator iterator() {
        return null;
    }
}
