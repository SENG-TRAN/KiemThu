import com.example.sang_ph61003.Bai1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bai1Test {
    Bai1 bai1 = new Bai1();
    @Test
    public void Hople() {
        assertEquals("Trung binh",bai1.hocLuc(6));
    }

    @Test
    public void Hople2(){
        assertEquals("Gioi",bai1.hocLuc(8));
    }

    @Test
    public void diemAm(){
        assertThrows(IllegalArgumentException.class, ()->bai1.hocLuc(-10));
    }
    @Test
    public void diemtren10(){
        assertThrows(IllegalArgumentException.class, ()->bai1.hocLuc(15));
    }
    @Test
    public void bienTren(){
        assertThrows(IllegalArgumentException.class, ()->bai1.hocLuc(11));
    }
}
