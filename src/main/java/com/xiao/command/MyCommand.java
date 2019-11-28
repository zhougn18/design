package com.xiao.command;

/**
 * 命令类中有接受者(士兵)的引用
 */
public class MyCommand implements Command {
    private String commanName;
    Receiver receiver;
    public MyCommand(Receiver receiver,String commanName) {
        this.receiver = receiver;
        this.commanName = commanName;
    }
    @Override
    public void exe() {
        receiver.doIt(commanName);
    }
}
