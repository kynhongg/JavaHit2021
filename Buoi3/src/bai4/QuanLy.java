package bai4;

import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);
    private String maQl;
    private String Hoten;

    public void NHAP(){
        System.out.print("Nhap ma quan ly: ");
        maQl = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        Hoten = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("\n\tMa quan ly: "+maQl);
        System.out.println("\tHo ten: "+Hoten);
        System.out.println("");
    }
}
