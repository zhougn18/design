package com.xiao.strategy;
/**
 * Cat比较大小根据 weight
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1,Cat cat2) {
        return cat1.getWeight() - cat2.getWeight();
    }
}
