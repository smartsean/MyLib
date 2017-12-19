package cn.smartsean.lib.utils;

import android.os.Build;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SimpleArrayMap;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * Created by SmartSean on 17/9/22 13:41.
 */

public class DataUtils {


    public static String getObjString(JSONObject object, String s) {
        String string = object.getString(s);
        return isEmpty(string) ? "" : string;
    }

    /**
     * 为空返回""
     *
     * @param s
     * @return
     */
    public static String getDefaultString(String s) {
        return isEmpty(s) ? "" : s;
    }

    /**
     * 为空返回默认值
     *
     * @param s
     * @return
     */
    public static String getDefaultString(String s, String defaultString) {
        if (isEmpty(s)) {
            return isEmpty(defaultString) ? "" : defaultString;
        } else {
            return s;
        }
    }


    public static int getDefaultInt(int i) {
        return isEmpty(i) ? 0 : i;
    }

    /**
     * float转double
     *
     * @param f
     * @return
     */
    public static double float2Double(float f) {
        BigDecimal b = new BigDecimal(Float.toString(f));
        return b.doubleValue();
    }

    /**
     * 判断float是否为0
     *
     * @param f
     * @return
     */
    public static boolean isZero(float f) {
        if (Math.abs(0.00 - f) < 0.000001) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断double是否为0
     *
     * @param d
     * @return
     */
    public static boolean isZero(double d) {
        if (Math.abs(0.00 - d) < 0.000001) {
            return true;
        } else {
            return false;
        }
    }

    private DataUtils() {
        throw new UnsupportedOperationException("can't instantiate me...");
    }

    /**
     * 判断对象是否为空
     *
     * @param obj 对象
     * @return {@code true}: 为空<br>{@code false}: 不为空
     */
    public static boolean isEmpty(final Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String && obj.toString().length() == 0) {
            return true;
        }
        if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
            return true;
        }
        if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
            return true;
        }
        if (obj instanceof Map && ((Map) obj).isEmpty()) {
            return true;
        }
        if (obj instanceof SimpleArrayMap && ((SimpleArrayMap) obj).isEmpty()) {
            return true;
        }
        if (obj instanceof SparseArray && ((SparseArray) obj).size() == 0) {
            return true;
        }
        if (obj instanceof SparseBooleanArray && ((SparseBooleanArray) obj).size() == 0) {
            return true;
        }
        if (obj instanceof SparseIntArray && ((SparseIntArray) obj).size() == 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            if (obj instanceof SparseLongArray && ((SparseLongArray) obj).size() == 0) {
                return true;
            }
        }
        if (obj instanceof LongSparseArray && ((LongSparseArray) obj).size() == 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            if (obj instanceof android.util.LongSparseArray && ((android.util.LongSparseArray) obj).size() == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断对象是否非空
     *
     * @param obj 对象
     * @return {@code true}: 非空<br>{@code false}: 空
     */
    public static boolean isNotEmpty(final Object obj) {
        return !isEmpty(obj);
    }
}
