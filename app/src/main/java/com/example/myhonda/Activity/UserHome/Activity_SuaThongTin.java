package com.example.myhonda.Activity.UserHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.Fragment.FragmentThongTin;
import com.example.myhonda.R;

public class Activity_SuaThongTin extends AppCompatActivity {
Button btnXacNhan,btnHuy_suaThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sua_thong_tin);
        btnXacNhan =findViewById(R.id.btn_xacNhan_suaThongTin);
        btnHuy_suaThongTin =findViewById(R.id.btn_huy_suaThongTin);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_SuaThongTin.this,Activity_SuaThongTin_ThanhCong.class);
                startActivity(intent);
            }
        });
        btnHuy_suaThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAction();
            }
        });

    }
    public void finishAction(){
        finish();
    };
}