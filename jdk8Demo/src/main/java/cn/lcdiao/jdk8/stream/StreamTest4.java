package cn.lcdiao.jdk8.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {    //一个 Stream 只可以使用一次     IllegalStateException: stream has already been operated upon or closed
        Stream<String> stream = Stream.of("hello","world","hello world");
//        //String[] strings = stream.toArray(length->new String[length]);//lamdba+stream创建String数组
//        String[] strings = stream.toArray(String[]::new);   //stream+方法引用创建String数组
//        Arrays.asList(strings).forEach(System.out::println);
//        List<String> list = stream.collect(Collectors.toList());    //collect本身是一个终止操作
//        list.forEach(System.out::println);
        //stream.collect(Collectors.toList()).forEach(System.out::println);//Collectors.toList()已经封装了下面三个参数
                    //第一个参数表示返回的类型,第二个参数遍历后保存在theList，最后返回theList，第三个参数将前两个参数返回的结果联系在一起
        //stream.collect(()->new ArrayList(),(theList,item)->theList.add(item),(theList1,theList2)->theList1.addAll(theList2)).forEach(System.out::println);
            //将上面转为用方法引用实现
//        stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll).forEach(System.out::println);
//
//        Stream<String> stream2 = Stream.of("hello","world","hello world");  //安装上面的格式将字符串拼接
//        System.out.println(stream2.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString());



//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);
//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);

        String str = stream.collect(Collectors.joining()).toString();       //将字符串拼接
        System.out.println(str);


    }
}
