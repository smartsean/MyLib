package cn.smartsean.lib.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * 退出app工具类
 * Created by SmartSean on 17/8/21 11:18.
 */

public class ExitUtil {
    private static long exitTime = 0;

    public static boolean indexOnKeyDown(Activity activity, int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(activity, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                exit(activity);
            }
            return true;
        }
        return false;
    }

    private static void exit(Activity activity) {

        Intent home = new Intent(Intent.ACTION_MAIN);
        home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        home.addCategory(Intent.CATEGORY_HOME);
        activity.startActivity(home);
        activity.finish();
    }
}
