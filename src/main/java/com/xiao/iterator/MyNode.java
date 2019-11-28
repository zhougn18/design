package com.xiao.iterator;

/**
 * 链表中的数据由一个一个的node节点组成
 * node里有一个存放数据的属性 和一个指向下一个节点的指针
 */
public class MyNode {
    //存放数据
    private Object object;
    //指向下一个节点
    MyNode next;

    public MyNode(Object object) {
        this.object = object;
    }
}
