package com.example.myhonda.Activity.QuenMatKhau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Activity.Activity_login;
import com.example.myhonda.R;

public class ActivityQuenMatKhau extends AppCompatActivity {
Button btnXacNhanMatKhau,btnHuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_mat_khau);
        btnXacNhanMatKhau = findViewById(R.id.btn_xacNhan_quenMK);
        btnHuy = findViewById(R.id.btn_huy_quenMK);
        btnXacNhanMatKhau.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(ActivityQuenMatKhau.this , Activity_DoiMatKhau_ThanhCong.class);
             startActivity(intent);
         }
     });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityQuenMatKhau.this , Activity_login.class);
                startActivity(intent);
            }
        });
    }
}