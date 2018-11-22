package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
//        list.stream().map(item->item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);

        list.stream().map(item->{
            String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);    //没有遇到终止操作，流的若干操作都不会执行(惰性求值)
        /*
test
Hello
test
World
test
Hello world
         */

    }
}
