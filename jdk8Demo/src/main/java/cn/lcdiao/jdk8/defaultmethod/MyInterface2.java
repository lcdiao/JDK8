package cn.lcdiao.jdk8.defaultmethod;

/**
 * Created by lcd on 2018/11/21.
 */
public interface MyInterface2 {

    default void myMethod(){
        System.out.println("MyInterface2的默认方法");
    }
}
