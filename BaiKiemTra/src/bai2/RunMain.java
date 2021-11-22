package bai2;

import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int chon;
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                // add book
                break;
            case 2:
                // edit book by id
                break;
            case 3:
                // delete book by id
                break;
            case 4:
                // Sort books by name (ascending)
                break;
            case 5:
                // Sort books by price (descending)
                break;
            case 6:
                // Show all books
                break;
            case 7:
                System.exit(0);
                break;

        }
    }
}
