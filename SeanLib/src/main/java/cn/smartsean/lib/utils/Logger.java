package cn.smartsean.lib.utils;

import android.util.Log;

import cn.smartsean.lib.BuildConfig;

/**
 * 日志类
 *
 * @author SmartSean on 17/12/19 16:45
 */
public class Logger {

    private static final boolean DEBUG = BuildConfig.DEBUG;

    private static final String TAG = "smartlog";

    public static void v(String s) {
        v(TAG, s);
    }

    public static void v(String tag, String s) {
        if (DEBUG)
            Log.v(tag, s);
    }

    public static void d(String s) {
        d(TAG, s);
    }

    public static void d(String tag, String s) {
        if (DEBUG)
            Log.d(tag, s);
    }

    public static void i(String s) {
        i(TAG, s);
    }

    public static void i(String tag, String s) {
        if (DEBUG)
            Log.i(tag, s);
    }

    public static void w(String s) {
        w(TAG, s);
    }

    public static void w(String tag, String s) {
        if (DEBUG)
            Log.w(tag, s);
    }

    public static void e(String s) {
        e(TAG, s);
    }

    public static void e(String tag, String s) {
        if (DEBUG)
            Log.e(tag, s);
    }
}
