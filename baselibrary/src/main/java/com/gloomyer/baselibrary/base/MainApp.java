package com.gloomyer.baselibrary.base;

import android.app.Application;

import java.lang.reflect.Method;

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        registerModels();
    }

    private void registerModels() {
        registerName("com.gloomyer.modellogin.App");
        registerName("com.gloomyer.modeuser.App");
    }


    private void registerName(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("init", Application.class);
            method.setAccessible(true);
            method.invoke(obj, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
