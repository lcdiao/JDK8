package cn.lcdiao.jdk8.stream;

/**
 * Created by lcd on 2018/11/22.
 */
public class Student {
    private String name;
    private int score;
    private int age;

    public Student(String name, int score,int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public Student(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }




}
