package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lcd on 2018/11/22.
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("hello","world","helloworld","test");
        //list.stream().forEach(System.out::println);
//        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("========================");

        List<Integer> list2  = Arrays.asList(1,2,3,4,5);
        list2.stream().map(i->i*i).forEach(System.out::println);

        System.out.println("========================");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8,9));
        stream.flatMap(theList->theList.stream()).map(i->i*i).forEach(System.out::println);//先把stream里面的所有list映射到一个list,转换为stream，然后在遍历操作
    }
}
