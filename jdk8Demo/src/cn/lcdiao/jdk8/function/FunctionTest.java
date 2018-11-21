package cn.lcdiao.jdk8.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1,value->2*value));
        System.out.println(test.compute(6,value->660+value));

        System.out.println(test.convert(5,value->String.valueOf(value+"helloworld")));

        Function<Integer,Integer> function = value->value*2;
        System.out.println(test.compute(4,function));
    }

                                //传入一个Integer类型，返回一个Integer类型
    public int compute(int a, Function<Integer,Integer> function){
        int result = function.apply(a);
        return result;
    }

                            //传入一个Integer类型，返回一个String类型
    public String convert(int a,Function<Integer,String> function){
        return function.apply(a);
    }

    //如果没有lamdba就需要自己事先定义这些方法
//    public int method(int a){
//        return 2*a;
//    }
//    public int method2(int a){
//        return 660+a;
//    }
//    public String method3(int a){
//        return String.valueOf(a+"helloworld");
//    }
}
