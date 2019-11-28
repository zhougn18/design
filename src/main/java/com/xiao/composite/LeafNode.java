package com.xiao.composite;

/**
 * 叶子节点
 */
public class LeafNode implements Node {
    private String nodeName;

    public LeafNode(String nodeName) {
        this.nodeName = nodeName;
    }
    @Override
    public void printName() {
        System.out.println(nodeName);
    }
}
