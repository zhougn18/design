package com.xiao.composite;

/**
 * 组合模式  一般用于对象结构是树形结构 如文件夹，公司组建架构，省市编码
 * 组合多个对象形成树形结构以表示有整体-部分关系层次结构
 * node 抽象节点
 */
public interface Node {
    //打印节点名称
    void printName();
}
