package com.gloomyer.component;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.gloomyer.baselibrary.ILoginService;
import com.gloomyer.baselibrary.IUserService;
import com.gloomyer.baselibrary.base.BaseActivity;
import com.gloomyer.baselibrary.base.ServiceManager;

public class MainActivity extends BaseActivity {

    private ILoginService mLoginService;
    private IUserService mUserService;
    private int userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginService = ServiceManager.get().getService(ServiceManager.KEY_LOGIN);
        mUserService = ServiceManager.get().getService(ServiceManager.KEY_USER);
        userId = -1;
    }

    public void login(View view) {
        mLoginService.launch(this, 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == RESULT_OK) {
            mLoginService.showLoginSuccessFragment(getSupportFragmentManager(), R.id.fl, null);
            userId = 123;
        }
    }

    public void showInfo(View view) {
        mUserService.launch(this, userId);
    }
}
