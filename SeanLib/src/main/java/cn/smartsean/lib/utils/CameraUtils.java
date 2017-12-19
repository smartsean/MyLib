package cn.smartsean.lib.utils;

import android.hardware.Camera;

/**
 * @author smartsean on 17/10/30 16:01
 */

public class CameraUtils {
    /**
     * 返回true 表示可以使用  返回false表示不可以使用
     */
    public static boolean cameraIsCanUse() {

        boolean isCanUse = true;
        Camera mCamera = null;
        try {
            mCamera = Camera.open();
            //针对魅族手机
            Camera.Parameters mParameters = mCamera.getParameters();
            mCamera.setParameters(mParameters);
        } catch (Exception e) {
            isCanUse = false;
        }

        if (mCamera != null) {
            try {
                mCamera.release();
            } catch (Exception e) {
                e.printStackTrace();
                return isCanUse;
            }
        }
        return isCanUse;
    }
}
