package com.rizkirafiif.praktikum2.inheritance;

// extend untuk mewarisi
public class B extends A{
    // variabel baru
    public int z;

    public void sumValue() {
        System.out.println("Jumlah : " +(x + y + z));
    }
}
