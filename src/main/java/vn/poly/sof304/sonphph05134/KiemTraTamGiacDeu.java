package vn.poly.sof304.sonphph05134;

import java.util.Scanner;

public class KiemTraTamGiacDeu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Mời nhập kích thước 3 cạnh của tam giác: ");
        System.out.println("Nhập a = ");
        a = sc.nextInt();
        System.out.println("Nhập b = ");
        b = sc.nextInt();
        System.out.println("Nhập c = ");
        c = sc.nextInt();
        double x;
        x =Double.MAX_VALUE+(1*Math.pow(10,308));
        System.out.println(x);
        boolean kq = checkTG(a, b, c);
        if (kq) {
            System.out.println("Tam giác bạn nhập là tam giác đều ");
        } else {
            System.out.println("Tam giác bạn nhập không phải tam giác đều ");
        }
    }

    public static boolean checkTG(double a, double b, double c) {
        //Kiểm tra có phải tam giác không
        if(a<=0 || b<=0||c<=0){
            System.out.println("Kích thước phải là giá trị > 0 ");
            return false;
        }else
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Đây không phải là tam giác ");
            return false;
        }else
        //Kiểm tra tam giác đều
        if (a == b && b == c) {
            System.out.println("Đây là tam giác đều ");
            return true;
        }
        return false;
    }

}
