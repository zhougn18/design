package com.xiao.command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new ReceiverImpl();
        Command command = new MyCommand(receiver,"跑步");
        Invoker invoker = new Invoker(command);
        invoker.sendCommand();
    }
}
