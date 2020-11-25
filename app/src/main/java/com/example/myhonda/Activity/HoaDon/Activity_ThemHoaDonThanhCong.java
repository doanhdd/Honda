package com.example.myhonda.Activity.HoaDon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Activity.UserHome.Activity_SuaThongTin;
import com.example.myhonda.Activity.UserHome.Activity_SuaThongTin_ThanhCong;
import com.example.myhonda.R;

public class Activity_ThemHoaDonThanhCong extends AppCompatActivity {

    Button btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__them_hoa_don_thanh_cong);
        btnQuayLai = findViewById(R.id.btn_quaylai_sua_tc);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}