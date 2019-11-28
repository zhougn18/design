package com.xiao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝子节点
 */
public class BranchNode implements Node {
    private String nodeName;

    public BranchNode(String nodeName) {
        this.nodeName = nodeName;
    }
    //枝子节点下还可以有叶子节点
    private List<Node> nodes = new ArrayList<>();

    @Override
    public void printName() {
        System.out.println(nodeName);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
