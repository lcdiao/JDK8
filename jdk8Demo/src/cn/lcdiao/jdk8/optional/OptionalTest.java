package cn.lcdiao.jdk8.optional;

import java.util.Optional;

/**
 * Created by lcd on 2018/11/21.
 */
public class OptionalTest {
    public static void main(String[] args) {
        //Optional<String> optional = Optional.of("hello");
        //Optional<String> optional = Optional.empty();
        Optional<String> optional = Optional.ofNullable("hello");
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //推荐使用函数式编程来写上面的代码
        optional.ifPresent(item-> System.out.println(item));    //如果optional为空则不执行这段代码
        System.out.println("========================");
        System.out.println(optional.orElse("world"));   //如果optional为空则会输出world，optional有值则会输出optional的值
        System.out.println("========================");
        System.out.println(optional.orElseGet(()->"nihao"));    //如果optional为空则会输出nihao，optional有值则会输出optional的值

    }
}
