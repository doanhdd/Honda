package com.example.myhonda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.example.myhonda.Activity.Activity_login;
import com.example.myhonda.Adapter.SliderAdapter;
import com.example.myhonda.Fragment.FragmentThemXe;
import com.example.myhonda.Model.ImageSlider;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class Activity_chao extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    SliderAdapter sliderAdapter;
    TextView chao_tv;
    List<ImageSlider> mImageSliderList;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chao);
        viewPager=findViewById(R.id.viewPage);
        circleIndicator=findViewById(R.id.circle);
        chao_tv=findViewById(R.id.chao_tv);
        mImageSliderList=getListimage();
        sliderAdapter=new SliderAdapter(this,mImageSliderList);
        viewPager.setAdapter(sliderAdapter);
        circleIndicator.setViewPager(viewPager);
        sliderAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
        autoSlider();
        chao_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activity_chao.this, Activity_login.class);
                startActivity(i);
            }
        });
    }
    public List<ImageSlider> getListimage(){
        List<ImageSlider> list=new ArrayList<>();
        list.add(new ImageSlider(R.drawable.honda));
        list.add(new ImageSlider(R.drawable.honda1));
        list.add(new ImageSlider(R.drawable.honda2));
        list.add(new ImageSlider(R.drawable.honda3));
        list.add(new ImageSlider(R.drawable.honda4));
        return list;
    }
    public void autoSlider(){
        if(mImageSliderList==null||mImageSliderList.isEmpty()||viewPager==null){
            return;
        }
        if(timer==null){
            timer=new Timer();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        int currenyitem=viewPager.getCurrentItem();
                        int totalitem=mImageSliderList.size()-1;
                        if(currenyitem<totalitem){
                            currenyitem++;
                            viewPager.setCurrentItem(currenyitem);
                        }else {
                            viewPager.setCurrentItem(0);
//                           Intent i=new Intent(Activity_chao.this, Activity_login.class);
//                            startActivity(i);//
//                            timer.cancel();
//                            timer=null;
                      }
                    }
                });
            }
        },500,3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(timer!=null){
            timer.cancel();
            timer=null;
        }
    }
}