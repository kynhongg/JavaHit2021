package bai3;

import java.util.Scanner;

public class NGUOI {

        Scanner sc = new Scanner(System.in);
        protected String FullName;
        protected String Birthday;
        protected String Country;

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String FullName) {
            this.FullName = FullName;
        }

        public String getBirthday() {
            return Birthday;
        }

        public void setBirthday(String Birthday) {
            this.Birthday = Birthday;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String Country) {
            this.Country = Country;
        }

        public NGUOI(){}

        public NGUOI(String FullName, String Birthday, String Country) {
            this.FullName = FullName;
            this.Birthday = Birthday;
            this.Country = Country;
        }

        public void InputNGUOI(){

            System.out.print("Nhap ho ten: ");
            FullName = sc.nextLine();

            System.out.print("Nhap ngay sinh: ");
            Birthday = sc.nextLine();

            System.out.print("Nhap que quan: ");
            Country = sc.nextLine();

        }
        public void OutputNGUOI(){


            System.out.println("Ho ten " + FullName);
            System.out.println("Ngay sinh " + Birthday);
            System.out.println("Que quan " + Country);

        }
    }

