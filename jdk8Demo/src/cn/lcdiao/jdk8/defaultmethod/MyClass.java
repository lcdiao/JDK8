package cn.lcdiao.jdk8.defaultmethod;

/**
 * Created by lcd on 2018/11/21.
 */
//public class MyClass implements MyInterface1,MyInterface2{   //如果实现两个有相同默认方法的接口，会报错！！！！ 除非自己重写方法
public class MyClass extends MyInterface1Impl implements MyInterface2{
//    @Override
//    public void myMethod(){
//        //System.out.println("MyClass重写后的方法");
//        MyInterface2.super.myMethod();//使用MyInterface2的默认方法
//    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();             //实现类的优先级要比接口高！！！
    }
}
