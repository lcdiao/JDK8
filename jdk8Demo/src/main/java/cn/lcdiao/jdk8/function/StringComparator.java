package cn.lcdiao.jdk8.function;

import java.util.*;

public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
        System.out.println(names);
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names, Comparator.reverseOrder());
        Collections.sort(names,(o1,o2)->o2.compareTo(o1));
        System.out.println(names);
        //names.forEach(name-> System.out.println(name));
    }
}
