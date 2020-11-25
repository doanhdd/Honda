package com.example.myhonda.Activity.UserHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Activity.Activity_login;
import com.example.myhonda.Activity.Dangki.Activity_DangKi_thanhCong;
import com.example.myhonda.Fragment.FragmentThongTin;
import com.example.myhonda.R;

public class Activity_SuaThongTin_ThanhCong extends AppCompatActivity {
Button  btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sua_thong_tin__thanh_cong);
        btnQuayLai = findViewById(R.id.btn_quaylai_sua_tc);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
    }
}