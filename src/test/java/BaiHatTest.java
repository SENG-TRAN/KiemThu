import com.example.sang_ph61003.BaiHat;
import com.example.sang_ph61003.BaiHatService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaiHatTest {
    BaiHatService service = new BaiHatService();


    @Test
    public void themThanhCong(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",3.0f,"Nhac rap");
        service.addBaiHat(bh);
        assertEquals("BH1",bh.getMa());
    }
    @Test
    public void thoiLuongBienDuoi(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",1.59f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
    @Test
    public void thoiLuongBienTren(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",6.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
    @Test
    public void thoiLuongKhoangDuoi(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",1.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
    @Test
    public void thoiLuongKhoangTren(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",10.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
    @Test
    public void maRong(){
        BaiHat bh = new BaiHat("","Con Co","Phuc Du",3.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }

    @Test
    public void tenRong(){
        BaiHat bh = new BaiHat("BH1","","Phuc Du",3.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }

    @Test
    public void tenCaSiRong(){
        BaiHat bh = new BaiHat("BH1","Con Co","",3.0f,"Nhac rap");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
    @Test
    public void theLoaiRong(){
        BaiHat bh = new BaiHat("BH1","Con Co","Phuc Du",3.0f,"");
        assertThrows(IllegalArgumentException.class, ()->service.addBaiHat(bh));
    }
}
