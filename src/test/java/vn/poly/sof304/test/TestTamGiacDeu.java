package vn.poly.sof304.test;
import org.junit.Test;
import vn.poly.sof304.sonphph05134.KiemTraTamGiacDeu;

import static org.junit.Assert.assertEquals;

public class TestTamGiacDeu {
    //Kiem tra kết quả đúng
    @Test
    public void testLaTamGiacDeu(){
        boolean expectResult = true;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(5,5,5));
    }
    //Kiểm tra kết quả sai
    @Test
    public void testKhongLaTamGiacDeu(){
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(5,6,7));
            }
    //Begin Kiểm tra phân vùng tương đương

    //vung không phải tam giác
    @Test
    public void testKhongPhaiTamGiac(){
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(5,6,12));
    }

    //vùng là tam giác và không phải tam giác đều
    @Test
    public void testLaTamGiacVaKhongLaTamGiacDeu() {
        boolean expectResult = false;
        assertEquals(expectResult, KiemTraTamGiacDeu.checkTG(5, 5, 6));
    }
    //vùng là tam giác và là tam giác đều
    @Test
    public void testLaTamGiacVaTamGiacDeu() {
        boolean expectResult = true;
        assertEquals(expectResult, KiemTraTamGiacDeu.checkTG(5, 5, 5));
    }

    //End Kiểm tra phân vùng tương đương

    //Begin Biên
    //a,b,c <0
    @Test
    public void testNhapNhoHonKhong(){
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(-1,-1,-1));
    }
    //a,b,c=0
    @Test
    public void testNhapBangnKhong(){
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(0,0,0));
    }
    //a,b,c >0 và không là tam giác đều
    @Test
    public void testNhapVaoLonHonKhong(){
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(3,5,7));
    }
    //a,b,c > 0 và là tam giác đều
    @Test
    public void testNhapVaoLonHonKhongVaLaTamGiacDeu(){

        boolean expectResult = true;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(5,5,5));
    }
    //a,b,c = max double
    @Test
    public void testNhapVaoMaxDoubleVaLaTamGiacDeu(){
        double x;
        x =Math.pow(10,308)*1.7976931348623157;
        boolean expectResult = true;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(x,x,x));
    }
    //a,b,c max double= 1.7976931348623157
    @Test
    public void testLaMaxDouble(){
        double x;
        x =Double.MAX_VALUE+(1*Math.pow(10,308));
        boolean expectResult = false;
        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(x,x,x));

    }
//    //a,b,c > max double, = 17976931348623157+1
//    @Test
//    public void testMaxDouble(){
//        boolean expectResult = false;
//        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(17976931348623158,17976931348623158,17976931348623158));
//    }
//    //a,b,c < max double, = 17976931348623157-1
//    @Test
//    public void testMinDouble(){
//        boolean expectResult = false;
//        assertEquals(expectResult,KiemTraTamGiacDeu.checkTG(17976931348623156,17976931348623156,17976931348623156));
//    }
    //End Biên
}
