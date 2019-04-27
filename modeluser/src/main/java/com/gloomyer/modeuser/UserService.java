package com.gloomyer.modeuser;

import android.content.Intent;

import com.gloomyer.baselibrary.IUserService;
import com.gloomyer.baselibrary.base.BaseActivity;

public class UserService implements IUserService {

    @Override
    public void launch(BaseActivity mCtx, int userId) {
        Intent data = new Intent(mCtx, UserActivity.class);
        data.putExtra(UserActivity.KEY_USER_ID, userId);
        mCtx.startActivity(data);
    }
}
