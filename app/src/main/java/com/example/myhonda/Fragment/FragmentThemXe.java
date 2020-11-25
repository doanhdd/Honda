package com.example.myhonda.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myhonda.Dao.XeDao;
import com.example.myhonda.Database.MySQL;
import com.example.myhonda.Model.Xe;
import com.example.myhonda.R;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class FragmentThemXe extends Fragment {
    EditText edtTen,edtMa,edtHangXe,edtMota,edtGia;
    Spinner spinnerLoai;
    int REQUEST_CODE_FOLDER = 123;
    ImageView getImg;
    String loaiXe;
    Button btn_add_themXe,btn_cancel_themXe;
    XeDao xeDao;
    List<String> listSpinerloaiXe;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_them_xe, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        edtGia=view.findViewById(R.id.edt_giaXe_themXe);
        edtTen=view.findViewById(R.id.edt_tenxe_themXe);
        edtMa=view.findViewById(R.id.edt_maxe_themXe);
        edtMota=view.findViewById(R.id.edt_moTa_themXe);
        edtHangXe=view.findViewById(R.id.edt_hangXe_themXe);
        spinnerLoai=view.findViewById(R.id.spinner_loaiXe_themXe);
        listSpinerloaiXe=new ArrayList<>();
        listSpinerloaiXe.add("Chọn loại xe");
        listSpinerloaiXe.add("Xe đạp điện");
        listSpinerloaiXe.add("Xe máy");
        listSpinerloaiXe.add("Xe Ôtô");
        listSpinerloaiXe.add("Xe Ôtô tải");
        listSpinerloaiXe.add("Xe môtô");

        getImg = view.findViewById(R.id.img_aGetImg);
        btn_add_themXe = view.findViewById(R.id.btn_add_themXe);
        btn_cancel_themXe = view.findViewById(R.id.btn_huy_themXe);
        ArrayAdapter arrayAdapter =new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,listSpinerloaiXe);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerLoai.setAdapter(arrayAdapter);
        spinnerLoai.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             loaiXe = spinnerLoai.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

         getImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_CODE_FOLDER);
            }
        });


        btn_add_themXe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                try {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) getImg.getDrawable();
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] img = byteArrayOutputStream.toByteArray();
                    xeDao = new XeDao(new MySQL(getActivity()));
                    Xe xe = new Xe();
                    xe.setImg(img);
                    xe.setGiaXe(Double.parseDouble(edtGia.getText().toString()));
                    xe.setHangXe(edtHangXe.getText().toString());
                    xe.setLoaiXe(loaiXe);
                    xe.setMaXe(edtMa.getText().toString());
                    xe.setMoTaXe(edtMota.getText().toString());
                    xe.setTenXe(edtTen.getText().toString());
                    if(xeDao.insertXe(xe)==true) {
                        Toast.makeText(getActivity(), "  Thêm Thành Công  ", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), " Thất bại  " + e, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cancel_themXe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHome fragment = new FragmentHome() ;
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_one, new FragmentHome() );

                transaction.commit();
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE_FOLDER && resultCode == getActivity().RESULT_OK && data != null) {
            Uri uri = data.getData();
            try {
                InputStream inputStream = getActivity().getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                getImg.setImageBitmap(bitmap);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }



}