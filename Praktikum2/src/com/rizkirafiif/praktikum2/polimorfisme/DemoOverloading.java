package com.rizkirafiif.praktikum2.polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Through the blood");
        Lagu lagu2 = new Lagu("Secukupnya", "Hindia");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
