package bai2;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] a;
    Scanner sc= new Scanner(System.in);

    public Array() {
        this.a = null;
        this.n = 0;
    }
    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void inputData() {
        System.out.print("Nhap so phan tu n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public void show() {
        for (int c: a) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    public void filter(boolean flag) {
        if (flag) {
            System.out.print("Mang chan: ");
            for (int i = 0; i < n; i++) {
                if(a[i] % 2 == 0)
                    System.out.print(a[i] + " ");
            }
        } else {
            System.out.print("Mang le: ");
            for (int i = 0; i < n; i++) {
                if(a[i] % 2 != 0)
                    System.out.print(a[i] + " ");
            }
        }
    }
}