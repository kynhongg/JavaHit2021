package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        b = sc.nextInt();
        System.out.print("Nhap vao so thu ba: ");
        c = sc.nextInt();
        if (a > b && a > c)
            System.out.print("Vay " + a + " la so lon nhat!");
        else if (b >a && b > c)
            System.out.print("Vay " + b + " la so lon nhat!");
        else
            System.out.print("Vay " + c + " la so lon nhat!");

    }
}