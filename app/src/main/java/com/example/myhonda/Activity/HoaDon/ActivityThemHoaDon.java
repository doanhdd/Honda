package com.example.myhonda.Activity.HoaDon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.R;

public class ActivityThemHoaDon extends AppCompatActivity {
Button btn_themHoaDon, btn_huy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_hoa_don);
        btn_themHoaDon = findViewById(R.id.btn_add_hoadon);
        btn_huy = findViewById(R.id.btn_huy_hoadon);
        btn_themHoaDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThemHoaDon.this, Activity_ThemHoaDonThanhCong.class);
                startActivity(intent);
            }
        });
        btn_huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        finish();
            }
        });
    }
}