package cn.lcdiao.jdk8.supplier;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by lcd on 2018/11/20.
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(12,12,(a,b)->a+b));
        System.out.println(test.compute(12,12,(a,b)->a*b));

        System.out.println("===========================================");

        System.out.println(test.getShort("abc123","world",(a,b)->a.length()-b.length()));
        System.out.println(test.getShort("abc123","world",(a,b)->a.charAt(0)-b.charAt(0)));
    }

    public int compute(int a,int b,BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }


    public String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }
}
