package bai1;

import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        System.out.print("Nhap vao mot chuoi bat ky: ");
        str = sc.nextLine();
        int dem = 0;
        int sum = 1;
        int temp = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                dem++;
                temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum *= temp;
            } else {
                result += result;
                result = 1;
            }
                if (dem != 0) {
                    System.out.println("Co " + dem + " ky tu so");
                    System.out.print("Tich: " + (float) result);
                } else {
                    System.out.println("Khong co ky tu so nao!");

                }

            }
    }
