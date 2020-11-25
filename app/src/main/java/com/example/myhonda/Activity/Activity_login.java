package com.example.myhonda.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myhonda.Activity.Dangki.ActivityDangki;
import com.example.myhonda.Activity.QuenMatKhau.ActivityQuenMatKhau;
import com.example.myhonda.R;

public class Activity_login extends AppCompatActivity {
    TextView tv_dangki, tv_quenMk,txt_dangKi_login;
    Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_dangKi_login = findViewById(R.id.txt_Dangki);
        tv_quenMk = findViewById(R.id.txt_fogotPassWork);
        btnDangNhap = findViewById(R.id.btn_login);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_login.this, BottomNavigationActivity.class);
                startActivity(i);
            }
        });


        txt_dangKi_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_login.this, ActivityDangki.class);
                startActivity(i);
            }
        });
        tv_quenMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_login.this, ActivityQuenMatKhau.class);
                startActivity(i);
            }
        });
    }
}