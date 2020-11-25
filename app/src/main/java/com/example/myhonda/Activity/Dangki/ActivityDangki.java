package com.example.myhonda.Activity.Dangki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Activity.Activity_login;
import com.example.myhonda.R;

public class ActivityDangki extends AppCompatActivity {
Button btnDangKi,btnHuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);

        btnDangKi = findViewById(R.id.btn_dangki_dk);
        btnHuy = findViewById(R.id.btnhuy_dk);
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDangki.this, Activity_login.class);
                startActivity(intent);
            }
        });
        btnDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDangki.this, Activity_DangKi_thanhCong.class);
                startActivity(intent);
            }
        });
    }
}