package bai2;

import java.util.Scanner;

public class SANPHAM {
    Scanner sc = new Scanner(System.in);
    private String ProductId;
    private String ProductName;
    private int Account;
    private float Price;


    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int Account) {
        this.Account = Account;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public void InputProduct(){
        System.out.print("Nhap ma san pham: ");
        ProductId = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        ProductName = sc.nextLine();
        System.out.print("Nhap so luong san pham: ");
        Account = sc.nextInt();
        System.out.print("Nhap don gia: ");
        Price = sc.nextFloat();

    }
    public void OutputProduct(){
        System.out.println("Ma san pham " + ProductId);
        System.out.println("Ten san pham " + ProductName);
        System.out.println("So luong san pham " + Account);
        System.out.println("Don gia " + Price);
    }
    public float ResultMoney(){
        return  Account*Price;
    }
}
