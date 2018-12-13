package cn.lcdiao.全新日期和时间api.joda;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

/**
 * Created by lcd on 2018/12/13.
 */
public class JodaTest1 {
    public static void main(String[] args) {
        IntList intList = new ArrayIntList();
        intList.add(1);
        intList.add(2);
        intList.forEach(System.out::println);
    }
}
