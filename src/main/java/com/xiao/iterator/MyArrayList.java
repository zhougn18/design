package com.xiao.iterator;

public class MyArrayList implements MyCollection{
    //初始化10个大小的数组
    private   Object[] objects = new Object[10];
    private int index=0;
    @Override
    public void add(Object object) {
        if (index == objects.length) {
            //扩容  是原来的两倍
            Object[] newObjects = new Object[objects.length*2];
            //把原来数组里的值 复制到新数组里
           // src表示源数组，srcPos表示源数组要复制的起始位置，desc表示目标数组，destPos表示放从目标数组的地几个位置开始放，length表示要复制的长度。
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            //把原来数组的引用指向新数组
            objects=newObjects;
        }
        objects[index]=object;
        index++;
    }

    @Override
    public int getSize() {
        return index;
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator {
        private int itindex=0;
        @Override
        public Object next() {
            return objects[itindex];
        }

        @Override
        public boolean hasNext() {
            itindex ++;
            if (index == itindex) {
                return false;
            }
            return true;
        }
    }
}
