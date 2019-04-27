package com.gloomyer.modellogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.gloomyer.baselibrary.ILoginService;
import com.gloomyer.baselibrary.base.BaseActivity;

public class LoginService implements ILoginService {

    @Override
    public void launch(BaseActivity mCtx, int requestCode) {
        Intent data = new Intent(mCtx, LoginActivity.class);
        mCtx.startActivityForResult(data, requestCode);
    }

    @Override
    public Fragment showLoginSuccessFragment(FragmentManager fm, int viewId, Bundle bundle) {
        SuccessFragment fragment = new SuccessFragment();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(viewId, fragment);
        transaction.show(fragment);
        transaction.commit();
        return fragment;
    }
}
