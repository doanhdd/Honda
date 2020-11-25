package com.example.myhonda.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myhonda.Activity.UserHome.Activity_SuaThongTin;
import com.example.myhonda.Activity.UserHome.Activity_SuaThongTin_ThanhCong;
import com.example.myhonda.R;


public class FragmentThongTin extends Fragment {
    Button btnSuaThongTin;
    public FragmentThongTin() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_thong_tin, container, false);
       btnSuaThongTin = rootView.findViewById(R.id.frag_suaThongTin_suaThongTin);
       btnSuaThongTin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity().getApplication(), Activity_SuaThongTin.class);
               startActivity(intent);
           }
       });
        return rootView;
    }
}