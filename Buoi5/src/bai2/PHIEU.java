package bai2;

import java.util.Scanner;

import java.util.ArrayList;

    public class PHIEU {

        private String VoucherId;
        private String VoucherName;
        private DateTime a ;
        private SANPHAM[]x;
        private int n;


        public String getVoucherId() {
            return VoucherId;
        }

        public void setVoucherId(String VoucherId) {
            this.VoucherId = VoucherId;
        }

        public String getVoucherName() {
            return VoucherName;
        }

        public void setVoucherName(String VoucherName) {
            this.VoucherName = VoucherName;
        }

        public DateTime getA() {
            return a;
        }

        public void setA(DateTime a) {
            this.a = a;
        }

        public SANPHAM[] getX() {
            return x;
        }

        public void setX(SANPHAM[] x) {
            this.x = x;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
        ArrayList<SANPHAM> prd;//prd:products

        public void InputPHIEU(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma phieu: ");
            VoucherId = sc.nextLine();

            System.out.print("Nhap ten phieu: ");
            VoucherName = sc.nextLine();

            a = new DateTime();
            a.InputDate();


            System.out.print("Nhap so san pham: "); n = sc.nextInt();
            prd = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                SANPHAM sp = new SANPHAM();
                System.out.println("Nhap thong tin san pham "+(i+1));
                sp.InputProduct();
                prd.add(sp);
            }

        }

        public void OutputPHIEU(){
            System.out.println("Ma phieu " + VoucherId);

            System.out.println("Ten phieu " + VoucherName );

            for(int i = 0 ; i < n ; i++){
                System.out.println("Thong tin san pham "+(i+1));
                prd.get(i).OutputProduct();
                System.out.println("Thanh tien "+ (i+1)  + " = " +  prd.get(i).ResultMoney());
            }
        }

    }

