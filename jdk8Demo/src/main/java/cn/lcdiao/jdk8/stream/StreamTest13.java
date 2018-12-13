package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,21);
        Student student4 = new Student("zhaoliu",80,22);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        /*
        1.循环列表
        2.取出学生的名字
        3.检查map中是否存在该名字，不存在则直接添加到该map中；存在则将map中的List对象取出来，然后将该Student对象添加到List中
        4.返回map对象
         */
          //          分组!!!
        //Map<String,List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        //Map<Integer,List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getScore));

        //Map<String,Long> map = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));    //按名字划分并输出总数
        //Map<Integer,Long> map = students.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.counting()));    //按成绩划分并输出总数

        Map<String,Double> map = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore))); //按名字划分并输出平均数
        map.forEach((s,v)-> System.out.println(s+":"+v));




        //              分区！！！(分区只有2个区！！)
        students = Arrays.asList(student1,student2,student3,student4);
        //按成绩是否大于等于90  进行分区
        Map<Boolean,List<Student>> m = students.stream().collect(Collectors.partitioningBy(s->s.getScore()>=90));
        //System.out.println(m.get(true));
        m.forEach((s,v)-> System.out.println(s+":"+v));
    }
}
