package com.gloomyer.baselibrary.base;

import java.util.HashMap;
import java.util.Map;

public class ServiceManager {
    public static final String KEY_LOGIN = "login";
    public static final String KEY_USER = "user";

    private enum Instance {
        instanace;
        ServiceManager sm;

        Instance() {
            sm = new ServiceManager();
        }
    }

    public static ServiceManager get() {
        return Instance.instanace.sm;
    }

    private Map<String, Object> services;

    private ServiceManager() {
        services = new HashMap<>();
    }

    public void register(String key, Object value) {
        services.put(key, value);
    }

    public <T> T getService(String key) {
        Object service = services.get(key);
        if (service != null) return (T) service;
        return null;
    }
}
