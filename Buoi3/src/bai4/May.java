package bai4;

import java.util.Scanner;

public class May {
    Scanner sc = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void NHAP(){
        System.out.print("Nhap ma may: ");
        maMay = sc.nextLine();
        System.out.print("Nhap kieu may: ");
        kieuMay = sc.nextLine();
        System.out.print("Nhap tinh trang may: ");
        tinhTrang = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("\tMa may: "+maMay);
        System.out.println("\tKieu May: "+kieuMay);
        System.out.println("\tTinh trang may: "+tinhTrang);

    }
}
