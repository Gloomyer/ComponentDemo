package com.gloomyer.modellogin;

import android.os.Bundle;
import android.view.View;

import com.gloomyer.baselibrary.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view) {
        setResult(RESULT_OK);
        finish();
    }
}
