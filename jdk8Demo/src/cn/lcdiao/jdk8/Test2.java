package cn.lcdiao.jdk8;

/**
 * Created by lcd on 2018/11/18.
 */
@FunctionalInterface
interface MyInterface {
    void test();

    String toString();//还是函数式接口
}
public class Test2{

    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        test2.myTest(()-> System.out.println("1.5"));
        System.out.println("-------------------------------------");

        MyInterface myInterface = ()->{
            System.out.println("myInterface");
        };
        System.out.println(myInterface.getClass());                         //class cn.lcdiao.jdk8.Test2$$Lambda$2/1149319664
        System.out.println(myInterface.getClass().getSuperclass());         //class java.lang.Object
        System.out.println(myInterface.getClass().getInterfaces()[0]);      //interface cn.lcdiao.jdk8.MyInterface
    }
}
