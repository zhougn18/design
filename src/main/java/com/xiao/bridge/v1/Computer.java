package com.xiao.bridge.v1;

/**
 * 非桥接模式
 * 电脑下有台式电脑，笔记本电脑等
 * 台式电脑下有苹果台式电脑，小米台式电脑等
 *笔记本电脑下有苹果笔记本电脑，小米笔记本电脑等
 *
 * 这样如果新增一个品牌  要新增两个类分别继承 笔记本电脑，台式电脑
 * 如果新增电脑类型 如ipd 要新类实现Computer  还要新增两个品牌小米ipd，苹果ipa继承新增的ipdcomputer类
 */
public interface Computer {
    void showName();
}
