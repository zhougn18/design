package com.xiao.command;

public class ReceiverImpl implements  Receiver {
    @Override
    public void doIt(String commanName) {
        System.out.println("士兵接收到了 ["+commanName+"] 命令");
    }
}
