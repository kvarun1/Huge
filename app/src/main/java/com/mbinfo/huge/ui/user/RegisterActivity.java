package com.mbinfo.huge.ui.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.mbinfo.huge.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
     MaterialButton register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        register = findViewById(R.id.id_reg);
        login = findViewById(R.id.id_login);
        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                Intent in = new Intent(this, MainActivity.class);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
                startActivity(in);
                finish();
                break;
            case R.id.id_login:
                Intent i = new Intent(this, MainActivity.class);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
                startActivity(i);
                finish();
                break;

        }
    }
}
