package cn.lcdiao.jdk8.supplier;

import java.util.function.Supplier;

/**
 * Created by lcd on 2018/11/20.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->"返回一个字符串";
        System.out.println(supplier.get());
    }
}
