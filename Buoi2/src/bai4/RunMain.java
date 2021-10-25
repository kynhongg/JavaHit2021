package bai4;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi bat ki: ");
        str = sc.nextLine();
        str = str.trim().toLowerCase();
        str = str.replaceAll(" +", " ");
        System.out.println("Chuan hoa 1 va 2: "+ str);
        str = str.replaceAll("[0-9]","");
        System.out.println("Chuan hoa 3: "+ str);
        String[] a = str.split(" ");
        str = "";

        for (int i = 0; i < a.length; i++){
            str += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if (i < a.length - 1){
                str += " ";
            }
        }
        System.out.println("Chuoi hoa 4: " + str);
    }
}
