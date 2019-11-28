package com.xiao.strategy;

public class Main {
    public static void main(String[] args) {
        comparePepole();
        System.out.println("---------------");
        compareCat();
    }

    public static void comparePepole(){
        Pepole p1 = new Pepole("张三",20);
        Pepole p2 = new Pepole("李四",10);
        Pepole p3 = new Pepole("王五",80);
        Pepole[] p={p1,p2,p3};
        Sorted<Pepole> sort = new Sorted<>();
        sort.sort(p, new PepoleComparator());
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void compareCat(){
        Cat c1 = new Cat(30,"tom",200);
        Cat c2 = new Cat(10,"kitty",150);
        Cat c3 = new Cat(20,"cat",280);
        Cat[] c={c1,c2,c3};
        Sorted<Cat> sort = new Sorted<>();
        sort.sort(c, new CatComparator());
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
