package com.xiao.strategy;
/**
 * 对集合中的数据排序
 */
public class Sorted<T> {
   public void sort(T[] array,Comparator<T> comparator) {
       for (int i = 0; i < array.length - 1; i++) {
           for (int j = i; j <array.length-1; j++) {
               if (comparator.compare(array[i],array[j + 1])<0 ) {
                   T tmp = array[j + 1];
                   array[j + 1] = array[i];
                   array[i]= tmp;
               }
           }
       }
   }
}
