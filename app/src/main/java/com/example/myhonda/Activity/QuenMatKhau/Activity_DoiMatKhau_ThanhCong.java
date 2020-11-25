package com.example.myhonda.Activity.QuenMatKhau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhonda.R;

public class Activity_DoiMatKhau_ThanhCong extends AppCompatActivity {
Button btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__doi_mat_khau__thanh_cong);
        btnQuayLai = findViewById(R.id.btn_quaylai_doiMk_tc);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_DoiMatKhau_ThanhCong.this , ActivityQuenMatKhau.class);
                startActivity(intent);
            }
        });
    }
}