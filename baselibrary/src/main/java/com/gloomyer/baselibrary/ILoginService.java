package com.gloomyer.baselibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.gloomyer.baselibrary.base.BaseActivity;

public interface ILoginService {

    void launch(BaseActivity mCtx, int requestCode);

    Fragment showLoginSuccessFragment(FragmentManager fm, int viewId, Bundle bundle);
}
