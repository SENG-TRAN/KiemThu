package com.example.sang_ph61003;

public class Bai1 {
    public String hocLuc(double diem){
        if(diem<0||diem>10){
            throw new IllegalArgumentException("Diem khong nam ngoai khoang 0-10");
        }
        if (diem>=9){
            return "Xuat sac";
        }else if(diem>=7){
            return "Gioi";
        }else if(diem>=5){
            return "Trung binh";
        }else{
            return "Yeu";
        }
    }
}
