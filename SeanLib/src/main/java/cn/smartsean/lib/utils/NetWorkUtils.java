package cn.smartsean.lib.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/**
 * @author smartsean on 17/11/6 16:36
 */
public class NetWorkUtils {

    /**
     * 判断是否有网络
     */
    public static boolean isNetworkConnected(Context context) {

        NetworkInfo mNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (mNetworkInfo != null) {
            return mNetworkInfo.isAvailable();
        }
        return false;
    }


    /**
     * 判断网络类型
     *
     * @return
     */
    public static String getNetWorkType(Context context) {

        NetworkInfo mNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (mNetworkInfo != null) {
            if (ConnectivityManager.TYPE_WIFI == mNetworkInfo.getType())
                return "WIFI";
            if (ConnectivityManager.TYPE_MOBILE == mNetworkInfo.getType()) {
                switch (mNetworkInfo.getSubtype()) {
                    case TelephonyManager.NETWORK_TYPE_HSUPA:
                        return "HSUPA";
                    case TelephonyManager.NETWORK_TYPE_UMTS:
                        return "UMTS";
                    case TelephonyManager.NETWORK_TYPE_GPRS:
                        return "GPRS";
                    case TelephonyManager.NETWORK_TYPE_EDGE:
                        return "EDGE";
                    case TelephonyManager.NETWORK_TYPE_CDMA:
                        return "CDMA";
                    case TelephonyManager.NETWORK_TYPE_EVDO_0:
                        return "EVDO_0";
                    case TelephonyManager.NETWORK_TYPE_HSPA:
                        return "HSPA";
                    case TelephonyManager.NETWORK_TYPE_HSDPA:
                        return "HSDPA";
                    case TelephonyManager.NETWORK_TYPE_EVDO_A:
                        return "EVDO_A";
                    default:
                        return "unknown";
                }
            }
        }
        return "unknown";
    }
}
