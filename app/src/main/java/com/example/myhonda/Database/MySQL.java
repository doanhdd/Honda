package com.example.myhonda.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQL extends SQLiteOpenHelper {
    private Context context;

    public MySQL(@Nullable Context context) {
        super(context, "mySql", null, 1);
        this.context = context;
    }
//    public byte[] img;
//    public String tenXe,hangXe,moTaXe,loaiXe,maXe;
//    public double giaXe;
    @Override
    public void onCreate(SQLiteDatabase db) {
        String table="Create table Xe(image blob,maXe text primary key,tenXe text,loaiXe text,hangXe text," +
                "giaXe double,moTaXe text)";
        db.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
