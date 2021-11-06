package bai2;

import java.util.Scanner;

public class NhanSu {
    Scanner sc = new Scanner(System.in);
    private String maNhanSu;
    private String hoTen;
    Date NS ;
    public void NHAP(){
        System.out.print("Nhap ma nhan su: ");
        maNhanSu = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        NS = new Date();
        NS.NHAP();
    }
    public void XUAT(){
        System.out.println("Ma Nhan Su: "+maNhanSu);
        System.out.println("Nhap ho ten: "+hoTen);
        NS.XUAT();
    }


}