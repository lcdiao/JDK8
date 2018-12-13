package cn.lcdiao.jdk8.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (String p)->p.length()>5;
        System.out.println(predicate.test("helllo"));
    }
}
