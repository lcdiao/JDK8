package cn.lcdiao.LamdbaTest;

/**
 * Created by lcd on 2018/11/15.
 */
@FunctionalInterface    //检查是否是函数式接口(只有一个抽象方法的接口)
public interface LamdbaInterface<T> {
    public int method(T a,T b);
}
