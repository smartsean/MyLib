package cn.smartsean.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/**
 * Created by zhj on 2016/2/24.
 */
public class DeviceUtil {

    public static DeviceUtil instance;

    public static TelephonyManager tm;

    public static DisplayMetrics dm;

    //    public static LocationManager lm;
    public static Build bd;

    public static DeviceUtil getInstance(Activity context) {

        if (null == instance) {
            instance = new DeviceUtil(context);
        }
        return instance;
    }

    public DeviceUtil(Activity context) {

        tm = (TelephonyManager) context.getBaseContext().getSystemService(Context.TELEPHONY_SERVICE);
        dm = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics(dm);
//        lm = (LocationManager) context.getBaseContext().getSystemService(Context.LOCATION_SERVICE);
        bd = new Build();
    }

    public static DeviceInfo gainPhoneInfo() {

        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceId(tm.getDeviceId());//IMEI
        deviceInfo.setDeviceSoftwareVersion(tm.getDeviceSoftwareVersion());
        deviceInfo.setTelNumber(tm.getLine1Number());
//        deviceInfo.setNetWorkCountryIso(tm.getNetworkCountryIso());
//        deviceInfo.setNetWorkOperator(tm.getNetworkOperator());
//        deviceInfo.setGetNetWorkOperatorName(tm.getNetworkOperatorName());
//        deviceInfo.setNetWorkType(tm.getNetworkType());
        deviceInfo.setPhoneType(tm.getPhoneType());
        deviceInfo.setSimCountryIso(tm.getSimCountryIso());
        deviceInfo.setSimOperator(tm.getSimOperator());
        deviceInfo.setSimOperatorName(tm.getSimOperatorName());
        deviceInfo.setSimSerialNumber(tm.getSimSerialNumber());
        deviceInfo.setSimState(tm.getSimState());
        deviceInfo.setSubscriberId(tm.getSubscriberId());//IMSI
        deviceInfo.setScreenHeigh(dm.heightPixels);
        deviceInfo.setScreenWidth(dm.widthPixels);
        deviceInfo.setBuildModel(bd.MODEL);
        deviceInfo.setBuildProduct(bd.PRODUCT);
        deviceInfo.setBuildDevice(bd.DEVICE);
        deviceInfo.setManufacturer(bd.MANUFACTURER);
        return deviceInfo;
    }

    /**
     * 获取版本号
     *
     * @return 当前应用的版本号
     */


    public static String getVersion(Context context) {

        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            return info.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getVersionCode(Context context) {

        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            return info.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
