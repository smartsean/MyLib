package cn.smartsean.lib.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by SmartSean on 17/8/20 18:03.
 */

public class StringUtils {

    public static String getString(JSONObject object, String key) {

        String result = object.getString(key);
        return result == null ? "" : result;
    }

    public static boolean isBlank(String s) {

        return isEmpty(s) || isWhitespace(s);
    }

    public static boolean isNotBlank(String s) {

        return !isBlank(s);
    }

    public static boolean isEmpty(String s) {

        return s == null || s.length() == 0;
    }

    public static boolean isWhitespace(String text) {

        if (text == null)
            return false;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i)))
                return false;
        }
        return true;
    }

    public static String getTrueString(String str) {

        return str == null ? "" : str;
    }

}
