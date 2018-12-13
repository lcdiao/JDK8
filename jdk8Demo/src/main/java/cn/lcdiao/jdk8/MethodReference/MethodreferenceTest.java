package cn.lcdiao.jdk8.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by lcd on 2018/11/21.
 */
public class MethodreferenceTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",66);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //students.sort((s1,s2)->Student.comparreStudentByScore(s1,s2));
//        students.sort(Student::comparreStudentByScore);     //1、类名::静态方法名
//        System.out.println(students);

//        StudentComparator studentComparator = new StudentComparator();
        //students.sort((s1,s2)->studentComparator.compareStudentByScore(s1,s2));
//        students.sort(studentComparator::compareStudentByName);        //2、引用名(对象名)::实例方法名
//        System.out.println(students);

        //students.sort(Student::compareByScore);                             //3、类名::实例方法名
//        students.sort(Student::compareByName);
//        students.forEach(student-> System.out.println(student));

//        List<String> cities = Arrays.asList("qingdao","changqing","tianjin","guangdon");
////        Collections.sort(cities,(c1,c2)->c1.compareToIgnoreCase(c2));
////        cities.forEach(city-> System.out.println(city));
//        Collections.sort(cities,String::compareToIgnoreCase);   //类名::实例方法名         跟上面两行结果一样！！！
//        cities.forEach(System.out::println);//引用名(对象名)::实例方法名

        MethodreferenceTest test = new MethodreferenceTest();
        //System.out.println(test.getString(()->"aaaa"));
        System.out.println(test.getString(String::new));
        System.out.println(test.getString2("aaa",String::new));
    }

    public String getString(Supplier<String> supplier){
        return supplier.get()+"test";
    }
    public String getString2(String str, Function<String,String> function){
        return function.apply(str);
    }
}
