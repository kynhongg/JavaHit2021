package com.company;

public class Main {

    public static void main(String[] args) {
        int height = 4, width = 6;
        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= width; j++)
            {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
