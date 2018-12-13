package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome","world hello","hello world hello","hello welcome");
        //找出list里面所有单词并且去重
//        List<String[]> result = list.stream().map(s->s.split(" ")).distinct().collect(Collectors.toList());
//        result.forEach(item->Arrays.asList(item).forEach(System.out::println));           //错误...

        list.stream().map(item->item.split(" "))    //Stream<String[]>类型
                .flatMap(Arrays::stream)        //Stream<String>类型      将stream里面的内容给打平了
                .distinct().collect(Collectors.toList()).forEach(System.out::println);


    }
}
