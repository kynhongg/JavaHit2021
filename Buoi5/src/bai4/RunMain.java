package bai4;

import java.util.Arrays;

public class RunMain {
        public static void main(String[] args) {
            SUM<Integer>SumT = new SUM<Integer>(1,4);
            System.out.println("Sum of type Interger = " + SumT.getSoA() + SumT.getSoB());

            SUM<Long>SumL = new SUM<Long>(11L , 22L);
            System.out.println("Sum of type Long = " + SumL.getSoA() + SumL.getSoB());

            SUM<Float>SumF = new SUM<Float>(3F , 5F);
            System.out.println("Sum of type Float = " + SumF.getSoA() + SumF.getSoB());

            SUM<Double>SumD = new SUM<Double>(2.6 , 8.1);
            System.out.println("Sum of type Double = " + SumL.getSoA() + SumL.getSoB());


        }
    }

