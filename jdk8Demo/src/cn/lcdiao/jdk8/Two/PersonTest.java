package cn.lcdiao.jdk8.Two;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhansan",20);
        Person person2 = new Person("lisi",30);
        Person person3 = new Person("wangwu",40);
        List<Person> persons = Arrays.asList(person1,person2,person3);

        PersonTest test = new PersonTest();
        //List<Person> personResult = test.getPersonsByUsername("zhansan",persons);
        //personResult.forEach(person-> System.out.println(person.getUsername()+","+person.getAge()));

        //List<Person> personResult = test.getPersonsByAge(20,persons);
        //personResult.forEach(person-> System.out.println(person.getUsername()+","+person.getAge()));

        List<Person> personResult = test.getPersonsByFun(40,persons,(age,personList)->{
            return personList.stream().filter(person->person.getAge()<age).collect(Collectors.toList());
        });
        personResult.forEach(person-> System.out.println(person.getUsername()+","+person.getAge()));

        System.out.println("---------------------------------------");

        List<Person> personResult2 = test.getPersonsByFun(10,persons,(age,personList)->{
            return personList.stream().filter(person->person.getAge()>age).collect(Collectors.toList());
        });
        personResult2.forEach(person-> System.out.println(person.getUsername()+","+person.getAge()));
    }

    public List<Person> getPersonsByUsername(String username,List<Person> persons){
        return persons.stream().filter(person->person.getUsername().equals(username)).
                collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(Integer age,List<Person> persons){
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList)->{
          return personList.stream().filter(person -> person.getAge()>ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age,persons);
    }
    public List<Person> getPersonsByFun(Integer age,List<Person> persons,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,persons);
    }
}
