package cn.lcdiao.全新日期和时间api.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * Created by lcd on 2018/12/13.
 */
public class JodaTest3 {

    public static void main(String[] args) {
        //将UTC转换为java的日期对象
        System.out.println(JodaTest3.convertUTC2Date("2014-11-05T09:22:54.876Z"));  //Wed Nov 05 17:22:54 CST 2014          自动转换为北京时间（+8小时）

        //将java日期转换为UTC时间
        System.out.println(JodaTest3.convertDate2UTC(new Date()));  //2018-12-13T08:05:58.055Z          自动-8小时

        //转换为指定格式的字符串
        System.out.println(JodaTest3.convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));  //2018-12-13 16:07:37
    }

    //标准UTC时间:   2014-11-05T09:22:54.876Z           Z表示没有时区   如果有时区，就换为+08:00   代表东八区
    public static Date convertUTC2Date(String utcDate){
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        }catch (Exception ex){
            return null;
        }
    }

    public static String convertDate2UTC(Date javaDate){
        DateTime dateTime =  new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date javaDate,String dateFormat){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }
}
