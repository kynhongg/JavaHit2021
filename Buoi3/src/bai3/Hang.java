package bai3;

import java.util.Scanner;

public class Hang {
        Scanner sc = new Scanner(System.in);
        private String maHang;
        private String tenHang;
        private Float dongGia;

        public void NHAP(){
            System.out.print("Nhap ma hang: ");
            maHang = sc.nextLine();
            System.out.print("Nhap ten hang: ");
            tenHang =sc.nextLine();
            System.out.print("Nhap don gia: ");
            dongGia = sc.nextFloat();
        }
        public void XUAT(){
            System.out.println("\n\tMa hang: "+maHang);
            System.out.println("\tTen hang: "+tenHang);
            System.out.println("\tDon gia: "+dongGia);
        }

        public Float getDongia() {
            return dongGia;
        }

    }


