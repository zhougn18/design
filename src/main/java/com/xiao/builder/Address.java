package com.xiao.builder;

public class Address {
    private String stress;
    private String xiaoqu;
    public Address(){}
    public Address(String stress, String xiaoqu) {
        this.stress = stress;
        this.xiaoqu = xiaoqu;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getXiaoqu() {
        return xiaoqu;
    }

    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu;
    }
}
