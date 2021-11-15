package bai4;

import java.util.ArrayList;

public class SUM<T>{
        private T SoA;
        private T SoB;

    public SUM(T soA, T soB) {
        SoA = soA;
        SoB = soB;
    }

    public T getSoA() {
        return SoA;
    }

    public void setSoA(T soA) {
        SoA = soA;
    }

    public T getSoB() {
        return SoB;
    }

    public void setSoB(T soB) {
        SoB = soB;
    }
}

