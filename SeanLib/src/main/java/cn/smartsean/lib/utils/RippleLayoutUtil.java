package cn.smartsean.lib.utils;

import android.graphics.Color;
import android.view.View;

import cn.smartsean.lib.widget.common.MaterialRippleLayout;


/**
 * 给View添加涟漪效果
 * Created by SmartSean on 17/8/21 13:37.
 */

public class RippleLayoutUtil {
    public static void addRippleNoCorner(View view) {
        addRippleWithCorner(view, 0);
    }

    public static void addRippleWithCorner(View view, int corner) {
        addRippleWithCorner(view, corner, corner, corner, corner);
    }

    public static void addRippleWithCorner(View view, int topLeftCorner, int topRightCorner, int bottomLeftCorner, int bottomRightCorner) {
        MaterialRippleLayout.on(view)
                .rippleColor(Color.parseColor("#f2f2f2"))
                .rippleAlpha(0.5f)
                .rippleTopLeftRoundedCorners(topLeftCorner)
                .rippleTopRightRoundedCorners(topRightCorner)
                .rippleBottomRightRoundedCorners(bottomLeftCorner)
                .rippleBottomLeftRoundedCorners(bottomRightCorner)
                .rippleDuration(200)
                .rippleOverlay(true)
                .rippleHover(true)
                .create();
    }
}
