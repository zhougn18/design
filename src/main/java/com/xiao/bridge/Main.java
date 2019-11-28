package com.xiao.bridge;

import com.xiao.bridge.v2.AppleBrand;
import com.xiao.bridge.v2.IpadComputer;

public class Main {
    public static void main(String[] args) {
        IpadComputer c = new IpadComputer(new AppleBrand());
        c.showName();
    }
}
