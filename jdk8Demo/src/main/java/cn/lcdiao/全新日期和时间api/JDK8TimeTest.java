package cn.lcdiao.全新日期和时间api;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lcd on 2018/12/13.
 */
public class JDK8TimeTest {
    public static void main(String[] args) {
        //现有的Date是线程不 安全的
        //LocalDate保证当前只有一个，线程安全
        LocalDate localDate =  LocalDate.now();
        System.out.println(localDate);      //2018-12-13
        System.out.println(localDate.getYear()+"-"+localDate.getMonthValue()+"-"+localDate.getDayOfMonth());//2018-12-13
        System.out.println("--------------------");

        LocalDate localDate2  = LocalDate.of(2018,12,13);
        System.out.println(localDate2); //2018-12-13

        System.out.println("--------------------");
        LocalDate localDate3  = LocalDate.of(2010,3,25);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(),localDate3.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2011,3,25));
        System.out.println(monthDay);//--03-25
        System.out.println(monthDay1);//--03-25
        if(monthDay.equals(monthDay1)){         //equals
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        System.out.println("--------------------");

        //LocalTime关注时分秒这些
        LocalTime time = LocalTime.now();
        System.out.println(time);//16:19:06.651
        LocalTime time1 = time.plusHours(3).plusMinutes(20);
        System.out.println(time1);//19:39:06.651
        System.out.println("--------------------");

        LocalDate localDate1 = localDate.plus(2, ChronoUnit.WEEKS);//增加两周
        LocalDate localDate4 = localDate.plusWeeks(2);
        System.out.println(localDate1);//2018-12-27
        System.out.println(localDate4);//2018-12-27
        System.out.println(localDate1.equals(localDate4));
        System.out.println("--------------------");

        LocalDate localDate5 = localDate.minus(2,ChronoUnit.MONTHS);//减少2月
        System.out.println(localDate5);//2018-10-13

        System.out.println("--------------------");

        Clock clock = Clock.systemDefaultZone();    //电脑默认的时区
        System.out.println(clock.millis());//1544690343110

        System.out.println("--------------------");

        LocalDate localDate6 = LocalDate.now();
        LocalDate localDate7 = LocalDate.of(2018,12,11);
        System.out.println(localDate6.isAfter(localDate7));//是否在localDate7日期之后
        System.out.println(localDate6.isBefore(localDate7));//是否在localDate7日期之前
        System.out.println(localDate6.equals(localDate7));

        System.out.println("--------------------");

        Set<String> set  = ZoneId.getAvailableZoneIds();
        Set<String> treeSet = new TreeSet<String >(){
            {addAll(set);}
        };//把set排序
        treeSet.stream().forEach(System.out::println);  //打印所有时区

        System.out.println("--------------------");

        ZoneId zoneId  = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime =  LocalDateTime.now();//当前日期和时间
        System.out.println(localDateTime);//2018-12-13T16:48:06.171
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime);//2018-12-13T16:48:06.171+08:00[Asia/Shanghai]

        System.out.println("--------------------");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);                          //2018-12
        System.out.println(yearMonth.lengthOfMonth());          //31
        System.out.println(yearMonth.isLeapYear());//是否闰年       false
        System.out.println("--------------------");

        YearMonth yearMonth1 = YearMonth.of(2016,2);
        System.out.println(yearMonth1);                          //2016-02
        System.out.println(yearMonth1.lengthOfMonth());          //29
        System.out.println(yearMonth1.isLeapYear());//是否闰年       true
        System.out.println("--------------------");

        LocalDate localDate8 = LocalDate.now();//2018-12-13
        LocalDate localDate9 = LocalDate.of(2020,1,3);
        Period period = Period.between(localDate8,localDate9);  //计算两个日期 的间隔
        System.out.println(period.getYears());  //1         相差 一年零二十一天
        System.out.println(period.getMonths()); //0
        System.out.println(period.getDays());   //21
        System.out.println("--------------------");

        System.out.println(Instant.now());      //2018-12-13T08:58:31.380Z          UTC表示方式

    }
}
