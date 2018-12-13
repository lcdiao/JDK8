package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        //将list里面的数字先x2后全部相加
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().map(i->i*2).sorted((a,b)->b-a).forEach(System.out::println);
        System.out.println(list.stream().map(i->2*i).reduce(0,Integer::sum));//42
        System.out.println(list.stream().map(i->2*i).reduce(Integer::sum));//Optional[42]
    }
}
