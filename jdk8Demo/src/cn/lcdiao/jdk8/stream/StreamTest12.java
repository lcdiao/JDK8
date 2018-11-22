package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi","hello","你好");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        //将两个list组合 3*4                 flatMap会得到单个的Stream对象,这里用map会得到若干个的stream组合的对象
        List<String> result = list1.stream().flatMap(item->list2.stream().map(item2->item+" "+item2)).collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
