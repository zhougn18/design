package com.xiao.strategy;

/**
 *策略模式
 * 比如当一个比较规则有多个算法时  就可以使用策略模式
 * 策略模式简单理解就是 对一个接口的多实现  当需要用到哪个实现  就创建对应实现的实例
 * 比如  不同的事物比较的规则不同  就可以用到策略模式
 * @param <T>
 */
public interface Comparator<T> {
    int compare(T t1,T t2);
}
