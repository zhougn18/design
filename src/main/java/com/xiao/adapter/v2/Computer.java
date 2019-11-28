package com.xiao.adapter.v2;

/**
 * computer 只具备读sdcard功能
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }
}
