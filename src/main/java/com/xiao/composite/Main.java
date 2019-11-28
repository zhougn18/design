package com.xiao.composite;

public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("CEO");
        BranchNode branchNode1 = new BranchNode("研发中心");
        BranchNode branchNode11 = new BranchNode("硬件技术部");
        Node leafNode111 = new LeafNode("王五");
        Node leafNode112 = new LeafNode("赵六");
        BranchNode branchNode12 = new BranchNode("软件技术部");
        Node leafNode121 = new LeafNode("小红");
        Node leafNode122 = new LeafNode("小明");
        BranchNode branchNode13 = new BranchNode("测试技术部");
        Node leafNode131 = new LeafNode("张三");
        Node leafNode132 = new LeafNode("李四");
        BranchNode branchNode2 = new BranchNode("行政中心");
        BranchNode branchNode21 = new BranchNode("人力资源");
        Node leafNode221 = new LeafNode("小小");
        branchNode11.addNode(leafNode111);
        branchNode11.addNode(leafNode112);
        branchNode12.addNode(leafNode121);
        branchNode12.addNode(leafNode122);
        branchNode13.addNode(leafNode131);
        branchNode13.addNode(leafNode132);
        branchNode21.addNode(leafNode221);
        branchNode1.addNode(branchNode11);
        branchNode1.addNode(branchNode12);
        branchNode1.addNode(branchNode13);
        branchNode2.addNode(branchNode21);
        root.addNode(branchNode1);
        root.addNode(branchNode2);
        tree(root, 0);

    }
    static void tree(Node b, int depth) {
        for(int i=0; i<depth; i++)
        {
            System.out.print("--");
        }
        b.printName();

        if(b instanceof BranchNode) {
            for (Node n : ((BranchNode)b).getNodes()) {
                tree(n, depth + 1);
            }
        }
    }
}
