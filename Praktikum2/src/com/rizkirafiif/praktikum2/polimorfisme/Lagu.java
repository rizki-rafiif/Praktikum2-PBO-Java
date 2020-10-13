package com.rizkirafiif.praktikum2.polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    // overloading
    // constructor 1 prameter
    public Lagu(String judul) {
        this.judul = judul;
    }

    // overloading
    // constructor 2 parameter
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    // getter manual
    public void getDataLagu(){
        System.out.println("Judul\t\t: " +judul);
        System.out.println("Pencipta\t: " +pencipta);
    }
}
