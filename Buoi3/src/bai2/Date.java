package bai2;
import java.util.Scanner;
public class Date {
        Scanner sc = new Scanner(System.in);
        private int D;
        private int M;
        private int Y;

        public void NHAP(){
            System.out.print("Nhap ngay: ");
            D = sc.nextInt();
            System.out.print("Nhap thang: ");
            M = sc.nextInt();
            System.out.print("Nhap nam: ");
            Y = sc.nextInt();
        }
        public void XUAT(){
            System.out.println("Date: "+D+"/"+M+"/"+Y);
        }
    }

