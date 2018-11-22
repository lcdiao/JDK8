package cn.lcdiao.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        //list.parallelStream().filter(s->s.length()>4).limit(1).forEach(System.out::println);
        //list.stream().filter(s->s.length()==5).findFirst().ifPresent(System.out::println);

//        list.stream().mapToInt(item->item.length()) //将list里面的元素映射成元素的长度
//                .filter(length->length==5)         //过滤掉元素里面不等于5的元素
//                .findFirst()                       //找到第一个元素
//                .ifPresent(System.out::println);   //有就打印，没有就emmmm

        list.stream().mapToInt(item->{
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length->length==5).findFirst().ifPresent(System.out::println);        //如果这里改为length==6，就会遍历输出全部，stream不会短路！！！！
        //结果:   操作会串型化！！！stream操作过程中会造成短路
        //hello
        //5

    }
}
