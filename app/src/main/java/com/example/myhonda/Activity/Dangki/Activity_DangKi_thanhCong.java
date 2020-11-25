package com.example.myhonda.Activity.Dangki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Activity.Activity_login;
import com.example.myhonda.R;

public class Activity_DangKi_thanhCong extends AppCompatActivity {
Button btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dang_ki_thanh_cong);
        btnQuayLai = findViewById(R.id.btn_quaylai_dk_tc);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_DangKi_thanhCong.this, Activity_login.class);
                startActivity(intent);
            }
        });

    }
}