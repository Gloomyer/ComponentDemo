package com.gloomyer.modellogin;

import android.app.Application;

import com.gloomyer.baselibrary.IApplication;
import com.gloomyer.baselibrary.base.ServiceManager;

public class App implements IApplication {

    @Override
    public void init(Application app) {
        ServiceManager.get().register(ServiceManager.KEY_LOGIN, new LoginService());
    }
}
