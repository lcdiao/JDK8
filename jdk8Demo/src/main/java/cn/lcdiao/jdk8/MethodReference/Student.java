package cn.lcdiao.jdk8.MethodReference;

/**
 * Created by lcd on 2018/11/21.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public Student(){}

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static int comparreStudentByScore(Student student1, Student student2){
        return student1.getScore()-student2.getScore();
    }
    public static int compareStudentByName(Student student1,Student student2){
        return student1.getName().compareTo(student2.getName());
    }
    public int compareByScore(Student student){
        return this.getScore()-student.getScore();
    }
    public int compareByName(Student student){
        return this.getName().compareToIgnoreCase(student.getName());
    }


}
