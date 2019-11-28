package com.xiao.iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection collection  = new MyArrayList();
        for (int i = 0; i < 21; i++) {
            collection.add(i+"o");
        }
        MyIterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
