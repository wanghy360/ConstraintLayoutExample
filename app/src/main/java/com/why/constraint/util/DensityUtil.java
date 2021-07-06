package com.why.constraint.util;


import android.util.TypedValue;

/**
 * Created by Why on 2021/6/21.
 */
public class DensityUtil {
    private DensityUtil() {
        throw new UnsupportedOperationException("DensityUtil cannot be instantiated");
    }

    public static int dp2px(float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, AppUtil.getContext().getResources().getDisplayMetrics());
    }

    public static int sp2px(float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, AppUtil.getContext().getResources().getDisplayMetrics());
    }

    public static float px2dp(float pxVal) {
        final float scale = AppUtil.getContext().getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    public static float px2sp(float pxVal) {
        return (pxVal / AppUtil.getContext().getResources().getDisplayMetrics().scaledDensity);
    }

}
