package com.mim.bountyportals.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mim.bountyportals.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }

    private void init() {
        getSupportActionBar().hide();
    }
}
