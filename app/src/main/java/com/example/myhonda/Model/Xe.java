package com.example.myhonda.Model;

public class Xe {
    public byte[] img;
    public String tenXe,hangXe,moTaXe,loaiXe,maXe;
    public double giaXe;

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getMoTaXe() {
        return moTaXe;
    }

    public void setMoTaXe(String moTaXe) {
        this.moTaXe = moTaXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public Xe(byte[] img, String tenXe, String hangXe, String moTaXe, String loaiXe, String maXe, double giaXe) {
        this.img = img;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.moTaXe = moTaXe;
        this.loaiXe = loaiXe;
        this.maXe = maXe;
        this.giaXe = giaXe;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }


    public Xe() {
    }
}
