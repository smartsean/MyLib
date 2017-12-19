package cn.smartsean.lib.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author SmartSean on 17/8/20 18:03
 */

public class DateUtils {

    public static final String YYYY_MM_DD_FORMAT = "yyyy-MM-dd";
    public static final String HH_MM_SS_FORMAT = "HH:mm:ss";
    public static final String YYYY_MM_DD_HH_MM_SS_FORMAT = "yyyy-MM-dd HH:mm:ss";

//    public static final SimpleDateFormat YYYY_MM_DD_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//    public static final SimpleDateFormat HH_MM_SS_FORMAT = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
//    public static final SimpleDateFormat YYYY_MM_DD_HH_MM_SS_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());


    /**
     * 当天的年月日  ex 2017-08-21
     *
     * @return
     */
    public static String todayYyyyMmDd() {
        return new SimpleDateFormat(YYYY_MM_DD_FORMAT).format(new Date());
    }

    /**
     * 当天的时分秒  ex 13:18:44
     *
     * @return
     */
    public static String todayHhMmSs() {
        return new SimpleDateFormat(HH_MM_SS_FORMAT).format(new Date());
    }


    /**
     * 当天的年月日时分秒   2017-08-21 13:18:44
     *
     * @return
     */
    public static String todayYyyyMmDdHhMmSs() {
        return new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_FORMAT).format(new Date());
    }

    public static String yyyyMmDdHhMmSsToYyyyMmDd(String s) {
        if (DataUtils.isEmpty(s)) {
            return "";
        }
        String s1 = "";
        try {
            s1 = new SimpleDateFormat(YYYY_MM_DD_FORMAT).format(string2Date(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s1;
    }

    /**
     * 将年月日时分秒转成Date类型
     *
     * @param time
     * @return
     */
    public static Date string2Date(String time) {
        return string2Date(time, YYYY_MM_DD_HH_MM_SS_FORMAT);
    }

    /**
     * 将年月日时分秒转成Date类型
     *
     * @param time
     * @return
     */
    public static Date string2Date(String time, String dateString) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateString);
            return simpleDateFormat.parse(time);
        } catch (ParseException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /**
     * 将Date类型转成年月日时分秒
     *
     * @param date
     * @return
     */
    public static String date2String(Date date) {
        return date2String(date, YYYY_MM_DD_HH_MM_SS_FORMAT);
    }

    /**
     * 将Date类型转成年月日时分秒
     *
     * @param date
     * @return
     */
    public static String date2String(Date date, String dateStrin) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateStrin);
        return simpleDateFormat.format(date);
    }

    /**
     * String 转 Calendar
     *
     * @param string
     * @return
     */
    public static Calendar string2Calendar(String string) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 获取两个日期之间的间隔
     *
     * @param s1
     * @param s2
     * @return
     */
    public static long getDayLengthBetween(String s1, String s2) {
        long length = 0;
        try {
            Date date1 = new SimpleDateFormat(YYYY_MM_DD_FORMAT).parse(s1);
            Date date2 = new SimpleDateFormat(YYYY_MM_DD_FORMAT).parse(s2);
            length = (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return length + 1;
    }


}
