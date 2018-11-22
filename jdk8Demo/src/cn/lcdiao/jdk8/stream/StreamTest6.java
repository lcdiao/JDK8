package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lcd on 2018/11/22.
 */
public class StreamTest6 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);       //generate同样可以生成Stream对象
//        //System.out.println(stream.findFirst().get()); //不符合Optional语义！！！
//        stream.findFirst().ifPresent(System.out::println);

        //.iterate()可以生成无限的串型流    f(...f(f(seed))...)       一般配合limit限制产生的个数
        //Stream.iterate(1,i->i+2).forEach(System.out::println);
        Stream.iterate(1,i->i+2).limit(6).forEach(System.out::println);//limit(6)  限制最多产生6个
        System.out.println("======================");
//        Stream.iterate("a",i->i+"a").limit(10).forEach(System.out::println);

        //找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前2个元素，然后再取流中的前2个元素，最后求出流中元素的总和
        Stream<Integer> stream = Stream.iterate(1,i->i+2).limit(6);
        //System.out.println(stream.filter(i->i>2).map(i->i*2).collect(Collectors.toList()).subList(2,4).stream().reduce(Integer::sum));
        //System.out.println(stream.filter(i->i>2).mapToInt(i->i*2).skip(2).limit(2).sum());  //skip(2)忽略前2个元素  limit取前两个元素
        //System.out.println(stream.filter(i->i>2).mapToInt(i->i*2).skip(2).limit(2).min());//取出最后最小的元素     min方法取到的值可能为null!!!
        //stream.filter(i->i>2).mapToInt(i->i*2).skip(2).limit(2).min().ifPresent(System.out::println);//这样才标准

//        IntSummaryStatistics summaryStatistics = stream.filter(i->i>2).mapToInt(i->i*2).skip(2).limit(2).summaryStatistics();
//        System.out.println(summaryStatistics.getMax());     //最大值
//        System.out.println(summaryStatistics.getMin());     //最小值
//        System.out.println(summaryStatistics.getCount());   //个数
//        System.out.println(summaryStatistics.getSum());     //和
//        System.out.println(summaryStatistics.getAverage()); //平均值
        System.out.println("======================");
//        System.out.println(stream);
//  //      System.out.println(stream.filter(i->i>2));
//        System.out.println(stream.distinct());

        //规避stream的重复使用
        System.out.println(stream);
        Stream<Integer> stream1 = stream.filter(i->i>2);
        System.out.println(stream1);
        Stream<Integer> stream2 = stream1.distinct();
        System.out.println(stream2);        //推荐使用方法链的方式使用stream
    }
}
