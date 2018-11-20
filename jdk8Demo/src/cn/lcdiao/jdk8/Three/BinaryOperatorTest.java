package cn.lcdiao.jdk8.Three;

import java.util.function.BinaryOperator;

/**
 * Created by lcd on 2018/11/20.
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(12,12,(a,b)->a+b));
        System.out.println(test.compute(12,12,(a,b)->a*b));
    }

    public int compute(int a,int b,BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }
}
