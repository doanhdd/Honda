package com.example.myhonda.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.myhonda.Model.ImageSlider;
import com.example.myhonda.R;

import java.util.List;

public class SliderAdapter extends PagerAdapter {
    private Context context;
    private List<ImageSlider> imageSliderList;

    public SliderAdapter(Context context, List<ImageSlider> imageSliderList) {
        this.context = context;
        this.imageSliderList = imageSliderList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View v= LayoutInflater.from(container.getContext()).inflate(R.layout.item_image,container,false);
        ImageView imageView=v.findViewById(R.id.image_slider);
        ImageSlider imageView1=imageSliderList.get(position);
        if(imageView1!=null){
            Glide.with(context).load(imageView1.getImage()).into(imageView);
        }
        container.addView(v);
        return v;
    }

    @Override
    public int getCount() {
        if(imageSliderList!=null){
            return imageSliderList.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((View) object);
    }
}
