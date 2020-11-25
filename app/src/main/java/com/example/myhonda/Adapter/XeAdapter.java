package com.example.myhonda.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhonda.Dao.XeDao;
import com.example.myhonda.Database.MySQL;
import com.example.myhonda.Model.Xe;
import com.example.myhonda.R;

import java.util.ArrayList;
import java.util.List;

import static androidx.core.app.ActivityCompat.startActivityForResult;

public class XeAdapter extends BaseAdapter {
    Context context;
    List<Xe> list;
    EditText edtTen,edtMa,edtHangXe,edtMota,edtGia;
    Spinner spinnerLoai;
    ImageView getImg;
    XeDao xeDao;
    String loaiXe;
    List<String> listSpinerloaiXe;
    private ImageView imageView,img_sua,img_xoa;
    Button sua_xe_btnCapNhat,sua_xe_btnThoat;
    TextView tvTen,tvGia,tvClickXem;
    TextView ctTen,ctGia,ctHang,ctMota,ctLoai,ctMa;
    ImageView ct_img;
    Button cbtn_thoat;
    public XeAdapter(Context context, List<Xe> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int positions, View view, ViewGroup parent) {

     final Xe  xe = list.get(positions);
        byte[] img = xe.getImg();
     final Bitmap  bitmap = BitmapFactory.decodeByteArray(img, 0, img.length);
        view = LayoutInflater.from(context).inflate(R.layout.xe_row, parent, false);
        tvTen=view.findViewById(R.id.xe_row_tvTenXe);
        tvGia=view.findViewById(R.id.xe_row_tvGiaXe);
        tvClickXem=view.findViewById(R.id.tv_clickXem);
        img_sua=view.findViewById(R.id.xe_row_img_sua);
        img_xoa=view.findViewById(R.id.xe_row_img_xoa);
        imageView = view.findViewById(R.id.img_xe);
        tvTen.setText("Tên xe : "+list.get(positions).tenXe);
        tvGia.setText("Giá : "+list.get(positions).giaXe);
        imageView.setImageBitmap(bitmap);
        tvClickXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.xem_chi_tiet_xe);
                dialog.show();
                ct_img=dialog.findViewById(R.id.ct_img);
                ct_img.setImageBitmap(bitmap);
                ctTen=dialog.findViewById(R.id.ct_ten);
                ctTen.setText("Tên : "+ xe.tenXe);
                ctGia=dialog.findViewById(R.id.ct_gia);
                ctGia.setText("Giá : "+ xe.giaXe);
                ctHang=dialog.findViewById(R.id.ct_hang);
                ctHang.setText("Hãng : "+ xe.hangXe);
                ctMa=dialog.findViewById(R.id.ct_ma);
                ctMa.setText("Mã : "+ xe.maXe);
                ctMota=dialog.findViewById(R.id.ct_mota);
                ctMota.setText("Mô tả : "+ xe.moTaXe);
                ctLoai=dialog.findViewById(R.id.ct_loai);
                ctLoai.setText("Loại : "+ xe.loaiXe);

                cbtn_thoat=dialog.findViewById(R.id.ct_btn);
                cbtn_thoat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }
        });
        img_xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xeDao=new XeDao(new MySQL(context));
          long ck=xeDao.deleteXe(list.get(positions).getMaXe());
          Xe xe1=list.get(positions);
          list.remove(xe1);
                notifyDataSetChanged();
          if(ck>0){
              Toast.makeText(context,"Xóa thành công",Toast.LENGTH_LONG).show();
          }else {
              Toast.makeText(context,"Thất bại",Toast.LENGTH_LONG).show();
          }

            }
        });
        img_sua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.sua_xe);
                dialog.show();
                getImg=dialog.findViewById(R.id.sua_xe_img);
                edtGia=dialog.findViewById(R.id.sua_xe_edt1);
                edtTen=dialog.findViewById(R.id.sua_xe_edt6);
                edtMa=dialog.findViewById(R.id.sua_xe_edt5);
                edtMota=dialog.findViewById(R.id.sua_xe_edt4);
                edtHangXe=dialog.findViewById(R.id.sua_xe_edt2);
                spinnerLoai=dialog.findViewById(R.id.sua_xe_edt3);
                listSpinerloaiXe=new ArrayList<>();
                listSpinerloaiXe.add("Chọn loại xe");
                listSpinerloaiXe.add("Xe đạp điện");
                listSpinerloaiXe.add("Xe máy");
                listSpinerloaiXe.add("Xe Ôtô");
                listSpinerloaiXe.add("Xe Ôtô tải");
                listSpinerloaiXe.add("Xe môtô");
                ArrayAdapter arrayAdapter =new ArrayAdapter(context, android.R.layout.simple_spinner_item,listSpinerloaiXe);
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



                sua_xe_btnCapNhat=dialog.findViewById(R.id.sua_xe_btnCapNhat);
                sua_xe_btnCapNhat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });



                sua_xe_btnThoat=dialog.findViewById(R.id.sua_xe_btnHuy);
                sua_xe_btnThoat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

            }
        });
        return view;
    }





}
