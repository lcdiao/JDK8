package cn.lcdiao.内置函数式接口测试;

import cn.lcdiao.LamdbaTest.Person;

import java.util.function.*;

/**
 * Created by lcd on 2018/11/15.
 */
public class Test {
    public static void main(String[] args) {
        //使用Predicate接口，判断某个person对象是否大于18岁
        //使用Consumer接口，传入一个字符串，打印字符串长度
        //使用Function接口，传入一个字符串，返回字符串长度
        //使用Supplier接口，创建一个姓名为张三，年龄28，成绩81的person对象
        //使用UnaryOperator接口，传入一个字符串，返回全转大写的新字符串

        Person person = new Person("张三",28,81);
        Predicate<Person> predicate = (p)->p.getAge()>18;
        System.out.println(predicate.test(person)); //true

        Consumer<String> consumer = (str)-> System.out.println(str.length());
        consumer.accept("asd"); //3

        Function<String ,Integer> function = (str)->str.length();
        System.out.println(function.apply("adsf"));     //4

        Supplier<Person> supplier = ()->new Person("张三",28,81);
        System.out.println(supplier.get());         //Person{name='张三', age=28, score=81}

        UnaryOperator<String > unaryOperator = (str)->str.toUpperCase();
        System.out.println(unaryOperator.apply("asdfEas")); //ASDFEAS
    }
}
