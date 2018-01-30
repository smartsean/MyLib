package cn.smartsean.lib.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;

import java.util.List;

/**
 * app管理类
 * Created by SmartSean on 17/8/30 18:04.
 */

public class AppManagerUtils {
    /**
     * 应用是否安装
     *
     * @param context
     * @param packageName
     * @return
     */
    public static boolean isInstalled(Context context, String packageName) {
        boolean installed = false;
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
        for (ApplicationInfo in : installedApplications) {
            if (packageName.equals(in.packageName)) {
                installed = true;
                break;
            } else {
                installed = false;
            }
        }
        return installed;
    }
}
