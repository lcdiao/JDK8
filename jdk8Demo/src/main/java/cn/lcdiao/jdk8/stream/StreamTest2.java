package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{5,6,7,8}).forEach(System.out::println);
        System.out.println("===============================");

        IntStream.range(3,8).forEach(System.out::println);//打印3-7
        System.out.println("===============================");
        IntStream.rangeClosed(3,8).forEach(System.out::println);//打印3-8
    }
}
