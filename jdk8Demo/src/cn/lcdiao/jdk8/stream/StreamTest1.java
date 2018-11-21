package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //Stream的创建     3种方式
        //流由三部分构成
        //1.源
        //2.零个或多个中间操作
        //3.终止操作
        //
        //流操作的分类：
        //1.惰性求值
        //2.及早求值
        Stream stream = Stream.of("hello","world","hello world");
        String[] myarray = new String[]{"hello","world","hello world"};
        Stream stream2 = Stream.of(myarray);
        Stream stream3 = Arrays.stream(myarray);

        List<String> list = Arrays.asList(myarray);
        Stream stream4 = list.stream();//最常用
    }
}
