package cn.lcdiao.jdk8.MethodReference;

/**
 * Created by lcd on 2018/11/21.
 */
public class StudentComparator {

    public int compareStudentByScore(Student s1,Student s2){
        return s1.getScore()-s2.getScore();
    }
    public int compareStudentByName(Student s1,Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

}
