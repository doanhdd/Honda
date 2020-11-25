package com.example.myhonda.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myhonda.Adapter.XeAdapter;
import com.example.myhonda.Dao.XeDao;
import com.example.myhonda.Database.MySQL;
import com.example.myhonda.Model.Xe;
import com.example.myhonda.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentDanhSach extends Fragment {
 ListView listView;
 EditText searchView;
 ImageView img1,img2,img3,img4,img5,img;
    public FragmentDanhSach() {
    }
    List<Xe> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_danh_sach, container, false);
        listView = view.findViewById(R.id.lv_xe);
        XeDao xeDao=new XeDao(new MySQL(getActivity()));
        list = new ArrayList<>();
        list=xeDao.getAllxe();
        img=view.findViewById(R.id.image);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list=xeDao.getAllxe();
                doDuLieu();
            }
        });
        img1=view.findViewById(R.id.image1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        list=xeDao.getAllxedap();
                doDuLieu();
            }
        });
        img2=view.findViewById(R.id.image2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list=xeDao.getAllxeOto();
                doDuLieu();
            }
        });
        img3=view.findViewById(R.id.image3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list=xeDao.getAllxeOtoTai();
                doDuLieu();
            }
        });
        img4=view.findViewById(R.id.image4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list=xeDao.getAllxeMoto();
                doDuLieu();
            }
        });
        img5=view.findViewById(R.id.image5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list=xeDao.getAllxeMay();
                doDuLieu();
            }
        });
        searchView=view.findViewById(R.id.searchView_list);
        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.toString().equalsIgnoreCase("")){
                    list=xeDao.getAllxe();
                    doDuLieu();
                }else{
                    list = xeDao.getAllTheoten(charSequence.toString());
                    doDuLieu();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        doDuLieu();
        return view;
    }
  public void doDuLieu(){

      XeAdapter xeAdapter = new XeAdapter(getActivity(), list);
      listView.setAdapter(xeAdapter);
  }

}