package bai3;
import java.util.Scanner;
public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        System.out.print("Nhap chuoi bat ki: ");
        str = sc.nextLine();
        int dem = 0;
        int sum = 0;
        for(int i = 0;i < str.length();i++)
            if(str.charAt(i) >= '0' && str.charAt(i)<='9'){
                dem ++;
                sum +=(str.charAt(i)  - '0' );
            }
        if(dem!= 0){
            System.out.println("true");
            System.out.print("Trung binh cong: "+ (float)sum / dem);
        }
        else{
            System.out.println("false");

        }
    }
}