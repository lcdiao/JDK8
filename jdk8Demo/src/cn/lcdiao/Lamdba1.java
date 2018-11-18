package cn.lcdiao;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by lcd on 2018/11/15.
 */
public class Lamdba1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是个Runnable接口的实例，用的是匿名内部类");
            }
        });
        thread.start();

        Thread thread1 = new Thread(()->System.out.println("这是个Runnable接口的实例，用的是Lamdba表达式"));
        thread1.start();

        Thread thread2 = new Thread(()->test());
        thread2.start();


        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("a");
        treeSet.add("d");
        treeSet.add("bb");
        treeSet.add("ccc");
        System.out.println(treeSet);//默认按首字母排序

        treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        treeSet.add("a");
        treeSet.add("cccc");
        treeSet.add("dd");
        treeSet.add("bbb");
        System.out.println("匿名内部类方式实现:"+treeSet);//按长度由少到多排序

        treeSet = new TreeSet<>((o1,o2)->Integer.compare(o1.length(),o2.length()));
        treeSet.add("a");
        treeSet.add("cccc");
        treeSet.add("dd");
        treeSet.add("bbb");
        System.out.println("Lamdba表达式实现:"+treeSet);//按长度由少到多排序
    }


    public static void test(){
        System.out.println("test");
    }
}
