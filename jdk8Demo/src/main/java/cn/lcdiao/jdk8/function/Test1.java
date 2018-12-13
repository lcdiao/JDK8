package cn.lcdiao.jdk8.function;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lcd on 2018/11/18.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.forEach(i-> System.out.print(i+"\t"));
        System.out.println("\n-------------------------------");

        list.forEach(System.out::print);    //方法引用 method reference         都可以创建@FunctionalInterface实例
        System.out.println("\n-------------------------------");

        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.forEach((s,i)-> System.out.print(s+":"+i+"\t"));
        System.out.println("\n-------------------------------");

    }
}
