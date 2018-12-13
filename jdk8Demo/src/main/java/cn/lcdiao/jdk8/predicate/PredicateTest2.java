package cn.lcdiao.jdk8.predicate;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest2 test = new PredicateTest2();
        test.conditionFilter(list,i->i%2==0);
        System.out.println("-----------------------");
        test.conditionFilter(list,i->i%2!=0);
        System.out.println("-----------------------");
        test.conditionFilter(list,i->true);
        System.out.println("-----------------------");
        test.conditionFilter2(list,i->i>5,i->i%2==0);
        System.out.println("-----------------------");
        test.conditionFilter3(list,i->i%2==0,i->i>5);
        System.out.println("-----------------------");
        test.conditionFilter4(list,i->i%2==0);
        System.out.println("-----------------------");
        System.out.println(test.isEqual(new Date()).test(new Date()));//false
        Date date = new Date();
        System.out.println(test.isEqual(date).test(date));              //true
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        list.stream().filter(predicate).collect(Collectors.toList()).forEach(i-> System.out.println(i));
    }

    //与
    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2){
        list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList()).forEach(i-> System.out.println(i));
    }
    //或
    public void conditionFilter3(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2){
        list.stream().filter(predicate.or(predicate2)).collect(Collectors.toList()).forEach(i-> System.out.println(i));
    }
    //非
    public void conditionFilter4(List<Integer> list, Predicate<Integer> predicate){
        list.stream().filter(predicate.negate()).collect(Collectors.toList()).forEach(i-> System.out.println(i));
    }

    //用来判断两个参数是不是相等的
    public Predicate<Date> isEqual(Object object){
        return Predicate.isEqual(object);
    }
}
