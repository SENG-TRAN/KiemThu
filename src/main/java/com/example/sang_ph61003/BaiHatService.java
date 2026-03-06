package com.example.sang_ph61003;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    BaiHat baiHat ;
    List<BaiHat> list = new ArrayList<BaiHat>();
    public void addBaiHat(BaiHat baiHat) {
        baiHat.validate(baiHat);
        list.add(baiHat);
    }
}
