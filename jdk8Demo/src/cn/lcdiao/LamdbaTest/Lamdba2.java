package cn.lcdiao.LamdbaTest;

import java.util.Comparator;

/**
 * Created by lcd on 2018/11/15.
 */
//语法规范
public class Lamdba2 {

    public static void main(String[] args) {
        //一、语法格式一：无参数，无返回值  ()->System.out.print("Lamdba");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("这是个匿名委托");
            }
        };
        runnable.run();

        runnable = ()->{
            System.out.print("Lamdba实现---->");
            System.out.println("这是个匿名委托");
        };
        runnable.run();


        //二、语法格式二：有一个参数，无返回值        (x)->System.out.print(x);
        TestInterface1 testInterface1 = new TestInterface1() {
            @Override
            public void test(String str) {
                System.out.println(str);
            }
        };
        testInterface1.test("匿名内部类");

        testInterface1 = (str)->{
            System.out.println(str);
        };
        testInterface1.test("Lamdba表达式");


        //三、语法格式三：若只有一个参数，小括号可以不写   x->System.out.print(x);
        testInterface1 = x-> System.out.println(x);
        testInterface1.test("若只有一个参数，小括号可以不写");


        //四、语法格式四：有两个以上的参数，有返回值，并且Lamdba体重有多条语句
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare = Integer.compare(o1.length(),o2.length());
                System.out.println("这是个匿名内部类");
                return compare;
            }
        };

        comparator = (str1,str2)->{
            int compare = Integer.compare(str1.length(),str2.length());
            System.out.println("这是个匿名内部类");
            return compare;
        };


        //五、语法五：若Lamdba体重只有一条语句，return和大括号都可以省略不写
        comparator = (String str1,String str2)->Integer.compare(str1.length(),str2.length());

        //六、语法六：Lamdba表达式的参数列表的数据类型可以省略不写(不写就都不能写，要不就全要写)，因为JVM编译器通过上下文推断出数据类型，即"类型推断"
        comparator = (str1,str2)->Integer.compare(str1.length(),str2.length());





    }

}
