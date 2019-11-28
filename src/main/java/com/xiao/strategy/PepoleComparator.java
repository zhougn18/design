package com.xiao.strategy;
/**
 * Pepole比较大小根据age
 */
public class PepoleComparator implements Comparator<Pepole> {
    @Override
    public int compare(Pepole pepole1,Pepole pepole2) {
        return pepole1.getAge() - pepole2.getAge();
    }
}
