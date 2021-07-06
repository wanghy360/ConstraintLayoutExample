package com.why.constraint;

import android.app.Application;

import com.why.constraint.util.AppUtil;

/**
 * Created by Why on 2021/6/21.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtil.init(this);
    }
}
