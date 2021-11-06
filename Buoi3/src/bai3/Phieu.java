package bai3;

import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);
    private String maPhieu;
    private Hang[] x;
    private int n ;

    public void NHAP(){
        System.out.print("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("Nhap so mat hang: ");
        n = sc.nextInt();
        x = new Hang[n];
        for( int i = 0  ; i < n ; i++){
            System.out.println("Nhap thong tin mat hang so "+(i+1));
            x[i] = new Hang();
            x[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("=========================");
        System.out.print("\tMa phieu: "+maPhieu);
        float s = 0;
        for(int i = 0; i< n; i++){
            x[i].XUAT();
            s += x[i].getDongia();
        }
        System.out.println("\nTong tien trong phieu : "+s);
    }

}