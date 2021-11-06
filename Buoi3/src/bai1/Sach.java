package bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soTrang;
    private float giaTien;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap so trang : ");
        soTrang = sc.nextInt();
        System.out.print("Nhap gia tien : ");
        giaTien = sc.nextFloat();
    }
    public void XUAT(){
        System.out.println("Ma Sach: "+maSach);
        System.out.println("Ten Sach: "+tenSach);
        System.out.println("NXB : "+nhaXuatBan);
        System.out.println("So trang: "+soTrang);
        System.out.println("Gia: "+giaTien);
    }
}
