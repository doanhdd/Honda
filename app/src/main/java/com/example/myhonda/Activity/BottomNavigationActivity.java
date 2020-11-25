package com.example.myhonda.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myhonda.Activity_chao;
import com.example.myhonda.Fragment.FragmentDanhSach;
import com.example.myhonda.Fragment.FragmentHome;
import com.example.myhonda.Fragment.FragmentThemXe;
import com.example.myhonda.Fragment.FragmentThongTin;
import com.example.myhonda.Fragment.FragmentTinTuc;
import com.example.myhonda.Model.Xe;
import com.example.myhonda.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView chipNavigationBar;
    Fragment fragment = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        chipNavigationBar = findViewById(R.id.navigation);
        chipNavigationBar.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment select = null;

            switch (menuItem.getItemId()){
                case R.id.item1:
                    select = new FragmentHome();
                    break;

                case R.id.item2:
                    select = new FragmentDanhSach();
                    break;

                case R.id.item3:
                    select = new FragmentThemXe();
                    break;

                case R.id.item4:
                    select = new FragmentTinTuc();
                    break;

                case R.id.item5:
                    select = new FragmentThongTin();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_one,select).commit();
            return true;
        }
    };
}
