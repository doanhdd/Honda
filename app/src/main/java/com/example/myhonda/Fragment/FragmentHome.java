package com.example.myhonda.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myhonda.Activity.ActivityTinTuc;
import com.example.myhonda.Activity.Activity_Account;
import com.example.myhonda.Activity.HoaDon.ActivityThemHoaDon;
import com.example.myhonda.Activity.ThongKe.ActivityThongkeHome;
import com.example.myhonda.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentHome extends Fragment {
    ImageView imageUser, imageAddCart, imageBill, imageList, imageThongke, imageNewPaper;

    public FragmentHome() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        imageUser = rootView.findViewById(R.id.image_user);
        imageAddCart = rootView.findViewById(R.id.image_addCar);
        imageList = rootView.findViewById(R.id.image_list);
        imageThongke = rootView.findViewById(R.id.image_thongke);
        imageNewPaper = rootView.findViewById(R.id.image_newPapers);
        imageBill = rootView.findViewById(R.id.image_bill);
        imageUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity().getApplication(), Activity_Account.class);
//                startActivity(intent);
               FragmentThongTin fragment = new FragmentThongTin();
               FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_one, new FragmentThongTin() );

                transaction.commit();
            }
        });
        imageAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity().getApplication(), Activity_Account.class);
//                startActivity(intent);
                FragmentThemXe fragment = new FragmentThemXe();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_one, new FragmentThemXe());

                transaction.commit();
            }
        });
        imageBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), ActivityThemHoaDon.class);
                startActivity(intent);
            }
        });
        imageThongke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), ActivityThongkeHome.class);
                startActivity(intent);

            }
        });
        imageList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity().getApplication(), Activity_Account.class);
//                startActivity(intent);
                FragmentDanhSach fragment = new FragmentDanhSach();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_one, new FragmentDanhSach() );
                transaction.commit();
        }
        });
        imageNewPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity().getApplication(), Activity_Account.class);
//                startActivity(intent);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_one, new FragmentTinTuc() );


                transaction.commit();
            }
        });
        return rootView;
    }
}