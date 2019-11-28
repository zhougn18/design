package com.xiao.command;

/**
 * 命令发出者（将军）
 * 命令发出者类中有命令的引用
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    //发出命令
    public void sendCommand(){
        command.exe();
    }
}
