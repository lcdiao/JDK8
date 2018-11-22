package cn.lcdiao.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,21);
        Student student4 = new Student("zhaoliu",80,22);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);


    }
}
