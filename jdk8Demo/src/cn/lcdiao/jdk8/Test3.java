package cn.lcdiao.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lcd on 2018/11/18.
 */
public class Test3 {
    public static void main(String[] args) {
        //lamdba表达式 创建@FunctionalInterface实例
        MyInterface1 i1 = ()->{};
        System.out.println(i1.getClass().getInterfaces()[0]);       //interface cn.lcdiao.jdk8.MyInterface1

        MyInterface2 i2 = ()->{};
        System.out.println(i2.getClass().getInterfaces()[0]);       //interface cn.lcdiao.jdk8.MyInterface2

        //()-{};    必须要根据上下文才能判断是哪个对象

        new Thread(()-> System.out.println("thread")).start();
        System.out.println("--------------------------------");

        List<String> list = Arrays.asList("hello","world","hello world");
        //list.forEach(s->{System.out.println(s.toUpperCase());});

        List<String> list2 = new ArrayList<>();
//        list.forEach(s->list2.add(s.toUpperCase()));
//        list2.forEach(s-> System.out.println(s));

        //采用Stream的方式
        //list.stream() .map(s->s.toUpperCase()).forEach(s->{list2.add(s);System.out.println(s);});
        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));



    }
}

@FunctionalInterface
interface MyInterface1{
    void myMethod();
}



@FunctionalInterface
interface MyInterface2{
    void myMethod();
}