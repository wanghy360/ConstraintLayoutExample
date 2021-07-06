package com.why.constraint.entity;

import android.app.Activity;

/**
 * Created by Why on 2021/6/21.
 */
public class FunEntity {
    private String title;
    private Class<? extends Activity> clazz;

    public FunEntity(String title, Class<? extends Activity> clazz) {
        this.title = title;
        this.clazz = clazz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class<? extends Activity> getClazz() {
        return clazz;
    }

    public void setClazz(Class<? extends Activity> clazz) {
        this.clazz = clazz;
    }
}
