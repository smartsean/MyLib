package cn.smartsean.lib.utils;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.smartsean.lib.R;


/**
 * 提示信息
 */
public class ToastUtil {

    private static Toast toast = null;

    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    private static final int LENGTH_SHORT = Toast.LENGTH_SHORT;

    public static void TextToast(Context context, CharSequence text, int duration) {

        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 300);
        toast.show();
    }

    public static void TextToast(Context context, int text, int duration) {

        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 300);
        toast.show();
    }

    public static void ImageToast(Context context, int ImageResourceId, CharSequence text, int duration) {

        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 300);
        View toastView = toast.getView();
        ImageView img = new ImageView(context);
        img.setImageResource(ImageResourceId);
        LinearLayout ll = new LinearLayout(context);
        ll.addView(img);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }

    public static void toastError(Context context, Object obj) {

        if (null == context) return;
        if (obj instanceof String) {
            if (DataUtils.isEmpty(String.valueOf(obj))) {
                Toast.makeText(context, context.getResources().getString(R.string
                        .server_sleep), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, String.valueOf(obj), Toast.LENGTH_SHORT).show();
            }
        } else if (obj instanceof Integer) {
            try {
                Toast.makeText(context, context.getResources().getString(Integer.parseInt
                        (String.valueOf(obj))), Toast
                        .LENGTH_SHORT).show();
            } catch (Exception e) {
//                Log.e(context.getClass().getName(), ErrorLogUtil.getStackMsg(e));
                Toast.makeText(context, context.getResources().getString(R.string
                                .server_sleep)
                        , Toast.LENGTH_SHORT).show();
            }
        }

    }

    /**
     * @param context
     * @param str     <br>
     *                提示toast
     */
    public static void toastError(Context context, String str) {

        if (null == context) return;
        if (DataUtils.isEmpty(str)) {
            Toast.makeText(context, context.getResources().getString(R.string.server_sleep)
                    , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * @param context
     * @param str     <br>
     *                提示toast
     */
    public static void toastError(Context context, int str) {

        if (null == context) return;
        try {
            Toast.makeText(context, context.getResources().getString(str), Toast
                    .LENGTH_SHORT).show();
        } catch (Exception e) {
//            Log.e(context.getClass().getName(), ErrorLogUtil.getStackMsg(e));
            Toast.makeText(context, context.getResources().getString(R.string.server_sleep)
                    , Toast.LENGTH_SHORT).show();
        }

    }

}