package cn.lcdiao.jdk8.defaultmethod;

/**
 * Created by lcd on 2018/11/21.
 */
public class MyInterface1Impl implements MyInterface1 {

    @Override
    public void myMethod() {
        System.out.println("MyInterface1Impl 重写后的方法");
    }
}
