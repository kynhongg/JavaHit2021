package bai2;

import java.util.Scanner;

public class DateTime {
    Scanner sc = new Scanner(System.in);
    protected  int Day;
    protected int Month;
    protected int Year;

    public DateTime(int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    public DateTime(){
    }
    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void InputDate(){
        System.out.print("Nhap ngay: ");
        Day = sc.nextInt();
        System.out.print("Nhap thang: ");
        Month = sc.nextInt();
        System.out.print("Nhap nam: ");
        Year = sc.nextInt();
    }

    public void OutputDate(){
        System.out.println("INFO DATE " + Day + "\\" + Month + "\\" + Year);
    }
}