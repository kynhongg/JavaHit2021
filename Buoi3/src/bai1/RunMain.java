package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        Sach[] x = new Sach[n];
        for( int i =0 ; i <n ; i++){
            System.out.println("Cuon sach "+(i+1));
            x[i] = new Sach();
            x[i].NHAP();
        }
        System.out.println("=====================");
        for( int i =0 ; i < n ; i++){
            System.out.println("Thong tin cuon sach "+(i+1));
            x[i].XUAT();
        }
    }
}
