package cn.lcdiao.全新日期和时间api.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Created by lcd on 2018/12/13.
 */
public class JodaTest2 {
    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));                     //2018-12-13
        System.out.println(tomorrow.toString("yyyy-MM-dd HH:mm:ss"));       //2018-12-14 15:31:13
        System.out.println("--------------------------");

        DateTime d1 =  today.withDayOfMonth(1);//将日期设置为这个月的 1 号
        System.out.println(d1.toString("yyyy-MM-dd HH:mm:ss"));             //2018-12-01 15:31:13
        System.out.println("--------------------------");

        LocalDate localDate = new LocalDate();//当前地区的时间
        System.out.println(localDate);                          //2018-12-13
        System.out.println("--------------------------");

        //计算当前时间三个月后最后一天的日期
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);          //2019-03-31
        //计算当前时间三个月后1号的日期
        localDate = new LocalDate();
        //localDate = localDate.plusMonths(3).withDayOfMonth(1);
        localDate = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate);          //2019-03-01

        System.out.println("--------------------------");

        //计算两年 前第三个月最后 一天的日期
        DateTime dateTime = new DateTime();
        DateTime dateTime1 = dateTime.minusYears(2)     //两年前
                .monthOfYear().setCopy(3)               //3月
                .dayOfMonth().withMaximumValue()        //最后一天
                .millisOfDay().withMaximumValue();      //最后时间
        System.out.println(dateTime1.toString("yyyy-MM-dd HH:mm:ss"));  //2016-03-31 23:59:59

        System.out.println("--------------------------");
    }
}
