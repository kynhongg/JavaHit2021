package bai4;

import java.util.Scanner;

public class PhongMay {
    Scanner sc = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private Float dienTich;
    private QuanLy x;
    private May y[];
    private int n;

    public void NHAP(){
        System.out.print("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.print("Nhap dien tich phong: ");
        dienTich = sc.nextFloat();
        x = new QuanLy();
        x.NHAP();
        System.out.print("Nhap so luong may: ");
        n = sc.nextInt();
        y = new May[n];
        for( int i = 0 ; i<n; i++){
            System.out.println("Nhap thong tin may so "+(i+1));
            y[i] = new May();
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("==============================");
        System.out.println("\tMa phong: "+maPhong);
        System.out.println("\tTen phong: "+tenPhong);
        System.out.println("\tDien tich: "+dienTich);
        x.XUAT();
        for(int i =0 ; i< n ; i++){
            y[i].XUAT();
        }
    }
}

