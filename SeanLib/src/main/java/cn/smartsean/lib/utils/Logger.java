package cn.smartsean.lib.utils;

import android.util.Log;

/**
 * @author SmartSean on 17/12/19 16:45
 */
public class Logger {

    private static final boolean DEBUG = true;
    private static final String TAG = "smartlog";

    public static void d(String s) {
        d(TAG, s);
    }

    public static void d(String tag, String s) {
        if (DEBUG)
            Log.d(tag, s);
    }

    public static void e(String s) {
        e(TAG, s);
    }

    public static void e(String tag, String s) {
        if (DEBUG)
            Log.e(tag, s);
    }
}
