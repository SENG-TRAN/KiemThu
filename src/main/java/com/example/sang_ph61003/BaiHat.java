package com.example.sang_ph61003;

public class BaiHat {
    private String ma;

    private String ten;

    private String tenCaSi;

    private float thoiLuong;

    private String theLoai;

    public BaiHat(String ma, String ten, String tenCaSi, float thoiLuong, String theLoai) {
        this.ma = ma;
        this.ten = ten;
        this.tenCaSi = tenCaSi;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public float getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(float thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public void validate(BaiHat baiHat){
        if(baiHat.getMa()==null||baiHat.getMa().trim().isEmpty()){
            throw new IllegalArgumentException ("Ma bai hat khong duoc de trong");
        }
        if(baiHat.getTen()==null||baiHat.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("Ten bai hat khong duoc de trong");
        }
        if (baiHat.getTenCaSi()==null||baiHat.getTenCaSi().trim().isEmpty()){
            throw new IllegalArgumentException("Ten ca si khong duoc de trong");
        }
        if(baiHat.getThoiLuong()<2||baiHat.getThoiLuong()>5.59){
            throw new IllegalArgumentException("Thoi luong phai nam trong khoang tu 2:00-5:59");
        }
        if (baiHat.getTheLoai()==null||baiHat.getTheLoai().trim().isEmpty()){
            throw new IllegalArgumentException("The Loai bai hat khong duoc de trong");
        }
    }
}
