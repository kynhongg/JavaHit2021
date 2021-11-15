package bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class LOPHOC {

    Scanner sc = new Scanner(System.in);
    private int ClassId;
    private String ClassName;
    private int StartDateOpen;

    private SINHVIEN[]x;
    private NGUOI GiaoVien;
    private int n;

    public LOPHOC(int ClassId, String ClassName, int StartDateOpen, SINHVIEN[] x, NGUOI GiaoVien, int n) {
        this.ClassId = ClassId;
        this.ClassName = ClassName;
        this.StartDateOpen = StartDateOpen;
        this.x = x;
        this.GiaoVien = GiaoVien;
        this.n = n;
    }
    public LOPHOC(){}
    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int ClassId) {
        this.ClassId = ClassId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public int getStartDateOpen() {
        return StartDateOpen;
    }

    public void setStartDateOpen(int StartDateOpen) {
        this.StartDateOpen = StartDateOpen;
    }

    public SINHVIEN[] getX() {
        return x;
    }

    public void setX(SINHVIEN[] x) {
        this.x = x;
    }

    public NGUOI getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(NGUOI GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    ArrayList<SINHVIEN>sts;

    public void InputLOPHOC(){
        System.out.println("NHAP THONG TIN LOP HOC");
        System.out.print("Nhap ma lop hoc: "); ClassId = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten lop hoc: ");ClassName = sc.nextLine();
        System.out.print("Nhap ngay mo: "); StartDateOpen = sc.nextInt();

        System.out.println("NHAP THONG TIN GIAO VIEN");
        GiaoVien = new NGUOI();
        GiaoVien.InputNGUOI();
        sts = new ArrayList<>();
        System.out.println("NHAP THONG TIN HOC SINH");
        System.out.print("Nhap so sinh vien: ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < n ; i++){
            System.out.println("\nNhap thong tin sinh vien thu "+(i+1));
            SINHVIEN std = new SINHVIEN();
            std.Input();
            sts.add(std);
        }

    }
    public void OutputLOPHOC(){
        System.out.println("\n=====> THONG TIN LOP HOC <=====");
        System.out.println("Ma lop hoc " + ClassId);
        System.out.println("Ten lop hoc " + ClassName);
        System.out.println("Ngay mo "+ StartDateOpen);
        System.out.println("Thong Tin Giao Vien");
        GiaoVien.OutputNGUOI();
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("\nThong tin sinh vien thu "+(i+1));
            sts.get(i).Output();
        }
    }

}