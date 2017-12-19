package cn.smartsean.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

/**
 * @author SmartSean on 17/9/8 18:34
 */
public class KeyBoardUtil {

    /**
     * 点击空白处,关闭输入法软键盘
     */
    public static void onHideSoftInput(MotionEvent event, Activity activity) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            tryHideSoftInput(activity);
        }
    }

    /**
     * 尝试隐藏输入法
     */
    public static void tryHideSoftInput(Activity activity) {

        if (activity.getCurrentFocus() != null && activity.getCurrentFocus().getWindowToken() != null) {
            ((InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow
                    (activity.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    /**
     * 自动打开软键盘
     *
     * created at 2016/4/23 21:58
     */
    public static void openKeyboard(Handler mHandler, int s, final Context context) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }, s);
    }

    /**
     * 关闭打开软键盘
     *
     * created at 2016/4/23 21:58
     */
    public static void closeKeybord(Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(null, 0);
    }

    /**
     * 在BaseActivity里面写的通用的隐藏软键盘
     *
     * @param token
     */
    public static void HideSoftInput(Activity activity, IBinder token) {
        if (token != null) {
            InputMethodManager im = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            im.hideSoftInputFromWindow(token,
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

}
