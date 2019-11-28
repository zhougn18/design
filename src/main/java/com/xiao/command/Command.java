package com.xiao.command;

/**
 * 命令模式
 * 把命令的发出和执行解耦
 * 如一个将军发出一条命令 让士兵去执行
 * 将军不关心士兵完成的过程  具体完成的过程让士兵去做
 */
public interface Command {
    void exe();
}
