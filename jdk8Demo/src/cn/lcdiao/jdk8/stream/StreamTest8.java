package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest8 {
    public static void main(String[] args) {
        //IntStream.iterate(0,i->(i+1)%2).distinct().limit(6).forEach(System.out::println);   //distinct()去重！！！   但这样写会无限循环执行下去
        IntStream.iterate(0,i->(i+1)%2).limit(6).distinct().forEach(System.out::println);//先限制个数再去重！
    }
}
