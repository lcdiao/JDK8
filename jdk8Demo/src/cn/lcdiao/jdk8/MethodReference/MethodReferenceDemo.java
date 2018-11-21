package cn.lcdiao.jdk8.MethodReference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lcd on 2018/11/21.
 */
public class MethodReferenceDemo {
    //方法引用共分为4类
    //1、类名::静态方法名
    //2、引用名(对象名)::实例方法名
    //3、类名::实例方法名
    //4、构造方法引用:类名::new
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
//        list.forEach(item-> System.out.println(item));            //lamdbd表达式遍历
        list.forEach(System.out::println);  //方法引用  结果一样

    }
}
