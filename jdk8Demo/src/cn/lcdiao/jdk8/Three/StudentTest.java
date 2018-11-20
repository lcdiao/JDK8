package cn.lcdiao.jdk8.Three;

import java.util.function.Supplier;

/**
 * Created by lcd on 2018/11/20.
 */
public class StudentTest {
    public static void main(String[] args) {
        //Supplier 不接受参数，返回泛型对象
        Supplier<Student> supplier = ()->new Student();     //用来做 工厂模式
        System.out.println(supplier.get().getName());
        System.out.println("-----------------------------------------------");

        Supplier<Student> supplier2 = Student::new;     //调用Student的构造方法！！
        System.out.println(supplier2.get().getName());
    }
}
