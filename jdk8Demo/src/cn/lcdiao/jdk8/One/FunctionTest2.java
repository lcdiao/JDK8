package cn.lcdiao.jdk8.One;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compute(2,value->value*3,value->value*value));//12      2*2*3
        System.out.println(test.compute2(2,value->value*3,value->value*value));//36     2*3*6

        System.out.println(test.compute3(3,4,(a,b)->a+b));
        System.out.println(test.compute3(3,4,(a,b)->a-b));
        System.out.println(test.compute3(3,4,(a,b)->a*b));
        System.out.println(test.compute3(3,4,(a,b)->a/b));

        System.out.println(test.compute4(5,6,(a,b)->a*b,a->a*a));


    }

                                //传入一个Integer类型，返回一个Integer类型
    public int compute(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer>biFunction){
        return biFunction.apply(a,b);
    }

    public int compute4(int a, int b, BiFunction<Integer,Integer,Integer>biFunction,Function<Integer,Integer>function){
        return biFunction.andThen(function).apply(a,b);
    }

}
