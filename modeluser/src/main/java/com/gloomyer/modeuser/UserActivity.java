package com.gloomyer.modeuser;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class UserActivity extends AppCompatActivity {

    public static final String KEY_USER_ID = "USER_ID";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user);

        int userId = getIntent().getIntExtra(KEY_USER_ID, -1);
        if (userId == -1) {
            Toast.makeText(this, "UID不能为空", Toast.LENGTH_SHORT).show();
            finish();
        }

        TextView tvHello = findViewById(R.id.tv_helle);
        tvHello.setText("你好啊!" + userId);
    }
}
