package cn.smartsean.lib.utils;

/**
 * @author SmartSean on 17/12/22 23:44
 */
public class AndroidMath {

    /**
     * 求正弦
     *
     * @param angle 角度
     * @return 返回该角度的正弦值
     */
    public static float sin(float angle) {
        return (float) Math.sin(Math.toRadians(angle));
    }

    /**
     * 求余弦
     *
     * @param angle 角度
     * @return 返回该角度的余弦值
     */
    public static float cos(float angle) {
        return (float) Math.cos(Math.toRadians(angle));
    }

    /**
     * 求正切
     *
     * @param angle 角度
     * @return 返回该角度的正切值
     */
    public static float tan(float angle) {
        return (float) Math.tan(Math.toRadians(angle));
    }

    /**
     * 获取Android坐标系中的象限
     *
     * @param pointX 点的x坐标
     * @param pointY 点的y坐标
     * @return 象限的枚举
     */
    public static QUADRANT getQuadrant(float pointX, float pointY) {
        if (pointX > 0) {
            if (pointY > 0) {
                return QUADRANT.FOURTH_QUADRANT;
            } else {
                return QUADRANT.FIRST_QUADRANT;
            }
        } else {
            if (pointY > 0) {
                return QUADRANT.THREE_QUADRANT;
            } else {
                return QUADRANT.SECOND_QUADRANT;
            }
        }

    }

    public static enum QUADRANT {
        /**
         * 第一象限
         */
        FIRST_QUADRANT,
        /**
         * 第二象限
         */
        SECOND_QUADRANT,
        /**
         * 第三象限
         */
        THREE_QUADRANT,
        /**
         * 第四象限
         */
        FOURTH_QUADRANT
    }
}
