package com.xiao.adapter.v2;

public class Main {
    public static void main(String[] args) {
        readSdCard();
        System.out.println("---------------");
        readTfCard();
    }

    public static void readSdCard(){
        Computer c= new Computer();
        SDCard sdCard = new SDCard();
        String sdMessage = c.readSD(sdCard);
        System.out.println(sdMessage);
    }

    public static void readTfCard(){
        TFCard tfCard = new TFCard();
        Computer c= new Computer();
        ComputerAdapterTf adapter=new ComputerAdapterTf(tfCard);
        System.out.println(c.readSD(adapter));
    }
}
