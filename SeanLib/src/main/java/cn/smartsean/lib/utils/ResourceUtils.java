package cn.smartsean.lib.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by SmartSean on 17/8/21 13:06.
 */

public class ResourceUtils {

    public static final String LAYTOUT = "layout";
    public static final String DRAWABLE = "drawable";
    public static final String MIPMAP = "mipmap";
    public static final String MENU = "menu";
    public static final String RAW = "raw";
    public static final String ANIM = "anim";
    public static final String STRING = "string";
    public static final String STYLE = "style";
    public static final String STYLEABLE = "styleable";
    public static final String INTEGER = "integer";
    public static final String ID = "id";
    public static final String DIMEN = "dimen";
    public static final String COLOR = "color";
    public static final String BOOL = "bool";
    public static final String ATTR = "attr";

    /**
     * 获得字符串
     *
     * @param context 上下文
     * @param strId   字符串id
     * @return 字符串
     */
    public static String getString(Context context, int strId) {
        return context.getResources().getString(strId);
    }

    /**
     * 获得Gradle中定义的字符串
     * @param context
     * @param strId
     * @return
     */
    public static String getGradleString(Context context, int strId) {
        return context.getResources().getString(strId);
    }

    /**
     * 获得颜色
     *
     * @param context 上下文
     * @param colorId 颜色id
     * @return 颜色
     */
    public static int getColor(Context context, int colorId) {
        return context.getResources().getColor(colorId);
    }

    /**
     * 获得Drawable
     *
     * @param context    上下文
     * @param drawableId Drawable的id
     * @return Drawable
     */
    public static Drawable getDrawable(Context context, int drawableId) {
        return context.getResources().getDrawable(drawableId);
    }
}
