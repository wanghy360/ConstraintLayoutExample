package com.why.constraint.util;

import android.annotation.SuppressLint;
import android.content.Context;

public class AppUtil {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public static void init(Context appContext) {
        context = appContext.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}