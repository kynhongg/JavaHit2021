package bai2;

import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static int[] a = new int[1000];
    static int n = 0;
    // Nhap mang
    public static void nhapmang() {
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.print("Cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
    // Xuat mang
    public static void xuatmang() {

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    // Them mot phan tu vao vi tri k bat ky
    public static void chen() {
        int vt;
        int scc;
        System.out.print("\nSo can chen vao: ");
        scc = sc.nextInt();
        System.out.print("Vi tri can chen: ");
        vt = sc.nextInt();
        for (int i = n; i >= vt; i--) {
            a[i] = a[i - 1];
        }
        a[vt - 1] = scc;
        n++;
        xuatmang();
    }

    // Xoa mot phan tu tai vi tri bat ky
    public static void xoa() {
        int vt;
        System.out.print("\nVi tri can xoa: ");
        vt = sc.nextInt();
        for (int i = vt-1; i < n; i++ ){
            a[i] = a[i+1];
        }
        n--;
        xuatmang();
    }

    // Hien thi mang dao nguoc
    public static void daonguoc() {
        int temp = 0;
        System.out.print("\nMang sau khi dao nguoc: ");
        for(int i = n-1; i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }



    public static void phantu_a1() {
        System.out.println("\na[1] = " + a[1]);
        System.out.print("Cac so chia het cho a[1] la: ");
        for(int i =0;i<n;i++){
            if(a[i] % a[1] == 0){
                System.out.println(" "+a[i]);
            }
        }
    }

    // Xuat ra man hinh tong cac so nguyen to
    public static boolean kiemtra(int n){
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void tongsnt() {
        int t=0;
        for(int i=0;i<n;i++){
            if(kiemtra(a[i]) == true)
                t+=a[i];
        }
        System.out.print("Tong SNT trong mang la: " +t);
    }


    public static void main(String[] args) {
        int chon;
        do {
            System.out.print("\nNhap vao cac lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapmang();
                    break;
                case 2:
                    xuatmang();
                    break;
                case 3:
                    chen();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    daonguoc();
                    break;
                case 6:
                    phantu_a1();
                    break;
                case 7:
                    tongsnt();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon lai!");
            }
        }while(chon !=0);
    }


}



