package cn.lcdiao.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for(int i=0;i<5000000;i++){
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");
        long startTime = System.nanoTime();

       // list.stream().sorted().count();               //4164
        list.parallelStream().sorted().count();         //2074      多线程解决

        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime-startTime); //纳秒

        System.out.println("排序耗时:"+millis);

    }
}
