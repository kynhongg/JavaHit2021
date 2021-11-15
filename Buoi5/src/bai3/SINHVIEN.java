package bai3;

import java.util.Scanner;
public class SINHVIEN extends NGUOI{
        Scanner sc = new Scanner (System.in);

        private String studentId;
        private String Majors;
        private int Course;

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getMajors() {
            return Majors;
        }

        public void setMajors(String Majors) {
            this.Majors = Majors;
        }

        public int getCourse() {
            return Course;
        }

        public void setCourse(int Course) {
            this.Course = Course;
        }

        public SINHVIEN() { }
        public SINHVIEN(String FullName, String Birthday, String Country , String studentId , String Majors , int Course) {
            super(FullName, Birthday, Country);
            this.Majors = Majors;
            this.studentId = studentId;
            this.Course = Course;
        }

        public void Input(){

            System.out.print("Nhap ma sinh vien: " );
            studentId = sc.nextLine();
            System.out.print("Nhap nganh: " );
            Majors =  sc.nextLine();
            System.out.print("Nhap khoa hoc: ");
            Course = sc.nextInt();
            super.InputNGUOI();
        }
        public void Output(){


            System.out.println("Ma sinh vien " + studentId);

            System.out.println("Nganh " + Majors);

            System.out.println("Khoa hoc "+ Course);

            super.OutputNGUOI();
        }

    }

