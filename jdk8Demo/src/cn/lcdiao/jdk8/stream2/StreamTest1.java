package cn.lcdiao.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Collector分析
 * Created by lcd on 2018/11/25.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        //1.collert:收集器
        //2.Collector作为collect方法的参数
        //3.Collector是一个接口,它是一个可变的汇聚操作，将输入元素累积到一个可变的结果容器中；
        //  它会在所有元素都处理完毕后，将累积的接口转换为一个最终的表示(这是一个可选操作).它支持串行与并行(多线程去执行)两种方式执行
        //4.Collectors本身提供了关于Collector的常见汇聚实现，Collectors本身实际上是一个工厂
        //5.

        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",99);
        Student student4 = new Student("zhaoliu",90);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        List<Student> students1 = students.stream().collect(toList());;
        students1.forEach(System.out::println);
        System.out.println("--------------------------");


        System.out.println("count:"+students.stream().collect(counting())); //使用Collectors的Counting方法               越具体的方法越好！！！！！！！！！！！！！！避免如自动装箱、拆箱的操作
        System.out.println("count:"+students.stream().count()); //使用stream自带的count方法

    }
}
