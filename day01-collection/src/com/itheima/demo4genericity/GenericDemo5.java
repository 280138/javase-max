package com.itheima.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        //目标：理解通配符 ? 和上下限
        //泛型上限： ? extends Car     ?能接收的必须是Car或者其子类
        //泛型下限： ? super Car      ?能接收的必须是Car或者其父类
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);

    }

    //需求：开发一个极品飞车的游戏
    //虽然Xiaomi和BYD都是Car的子类，但是ArrayList<Xiaomi> ArrayList<BYD> 和 ArrayList<Car> 没有半毛钱关系
//    public static void go(ArrayList<Car> cars){//此处用ArrayList<Car>上面两个都会报错
//    }
    public static void go(ArrayList<? extends Car> cars){//通配符？在使用泛型的时候代表一切类型
    }
}
