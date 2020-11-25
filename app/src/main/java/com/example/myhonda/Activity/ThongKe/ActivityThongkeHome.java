package com.example.myhonda.Activity.ThongKe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.R;

public class ActivityThongkeHome extends AppCompatActivity {
Button btnThongKeTheoNgay,btnThongKeTheoTuan,btnThongKeTheoThang,btnThongKeTheoNam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongke_home);
        btnThongKeTheoNgay =findViewById(R.id.btn_thongKeTheoNgay);
        btnThongKeTheoTuan = findViewById(R.id.btn_thongKeTheoTuan);
        btnThongKeTheoThang = findViewById(R.id.btn_thongKeTheoThang);
        btnThongKeTheoNam = findViewById(R.id.btn_thongKeTheoNam);
        btnThongKeTheoNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThongkeHome.this,ActivityThongKeTheoNgay.class);
                startActivity(intent);
            }
        });
        btnThongKeTheoTuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThongkeHome.this,ActivityThongKeTheoTuan.class);
                startActivity(intent);
            }
        });
        btnThongKeTheoThang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThongkeHome.this,ActivityThongKeTheoThang.class);
                startActivity(intent);
            }
        });
        btnThongKeTheoNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThongkeHome.this,ActivityThongKeTheoNam.class);
                startActivity(intent);
            }
        });
    }
}