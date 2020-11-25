package com.example.myhonda.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.myhonda.Database.MySQL;
import com.example.myhonda.Model.Xe;

import java.util.ArrayList;
import java.util.List;

public class XeDao {
    MySQL mySQL;

    public XeDao(MySQL mySQL) {
        this.mySQL=mySQL;
    }


    public boolean insertXe(Xe xe) {
        SQLiteDatabase sqLiteDatabase = mySQL.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("image",xe.getImg());
        contentValues.put("maXe",xe.getMaXe());
        contentValues.put("tenXe",xe.getTenXe());
        contentValues.put("loaiXe",xe.getLoaiXe());
        contentValues.put("hangXe",xe.getHangXe());
        contentValues.put("giaXe",xe.getGiaXe());
        contentValues.put("moTaXe",xe.getMoTaXe());
        long kq = sqLiteDatabase.insert("Xe", null, contentValues);
        if (kq > 0) {
            return true;
        } else {
            return false;
        }


    }

    public List<Xe> getAllxe() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }

    public List<Xe> getAllxedap() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe where loaiXe='Xe đạp điện' ";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }


    public List<Xe> getAllxeMay() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe  where loaiXe='Xe máy'";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }

    public List<Xe> getAllxeMoto() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe   where loaiXe='Xe môtô'";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }



    public List<Xe> getAllxeOto() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe where loaiXe='Xe Ôtô'";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }
    public List<Xe> getAllxeOtoTai() {

        List<Xe> list = new ArrayList<>();

        String query = "select * from Xe where loaiXe='Xe Ôtô tải'";

        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }
    public List<Xe> getAllTheoten(String s) {
        List<Xe> list = new ArrayList<>();
        String query = "select * from Xe where tenXe like '%"+s+"%' ";
        Cursor cursor = mySQL.getReadableDatabase().rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Xe xe = new Xe();
                //    String table="Create table Xe(image blob,maXe text,tenXe text,loaiXe text,hangXe text," +
//            "giaXe double,moTaXe text)";
                xe.img = cursor.getBlob(cursor.getColumnIndex("image"));
                xe.maXe = cursor.getString(cursor.getColumnIndex("maXe"));
                xe.tenXe = cursor.getString(cursor.getColumnIndex("tenXe"));
                xe.loaiXe = cursor.getString(cursor.getColumnIndex("loaiXe"));
                xe.hangXe = cursor.getString(cursor.getColumnIndex("hangXe"));
                xe.giaXe = cursor.getDouble(cursor.getColumnIndex("giaXe"));
                xe.moTaXe = cursor.getString(cursor.getColumnIndex("moTaXe"));
                list.add(xe);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return list;
    }
    public long updateXe(Xe xe,String ma){
        SQLiteDatabase sqLiteDatabase = mySQL.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("image",xe.getImg());
        contentValues.put("maXe",xe.getMaXe());
        contentValues.put("tenXe",xe.getTenXe());
        contentValues.put("loaiXe",xe.getLoaiXe());
        contentValues.put("hangXe",xe.getHangXe());
        contentValues.put("giaXe",xe.getGiaXe());
        contentValues.put("moTaXe",xe.getMoTaXe());
        long resul=sqLiteDatabase.update("Xe",contentValues,"maXe = ?",new String[]{ma});
        return resul;
        // update
    }
    public long deleteXe(String ma){
        SQLiteDatabase sqLiteDatabase = mySQL.getWritableDatabase();
        long resul=sqLiteDatabase.delete("Xe","maXe = ?",new String[]{ma});
        return resul;
    }
}
