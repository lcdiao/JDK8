package cn.lcdiao.LamdbaTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lcd on 2018/11/15.
 */
public class Test {
    public static void main(String[] args) {
        LamdbaInterface<Person> lamdba = (p1,p2)->Integer.compare(p1.getAge(),p2.getAge());
        Person p1 = new Person("zs",12,99);
        Person p2 = new Person("zs",13,90);
        System.out.println(lamdba.method(p1,p2));

        lamdba = (p3,p4)->Integer.compare(p3.getScore(),p4.getScore());

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(new Person("zoo",11,78));
//        persons.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                //return o1.getScore()-o2.getScore();
//                return Integer.compare(o1.getScore(),o2.getScore());
//            }
//        });
        System.out.println(persons);//[Person{name='zs', age=12, score=99}, Person{name='zs', age=13, score=90}, Person{name='zoo', age=11, score=78}]
        persons.sort((o1,o2)->Integer.compare(o1.getScore(),o2.getScore()));
        System.out.println(persons);//[Person{name='zoo', age=11, score=78}, Person{name='zs', age=13, score=90}, Person{name='zs', age=12, score=99}]
    }
}
