package com.rizkirafiif.praktikum2.polimorfisme;

//mewarisi kelas parent X
public class Y extends X {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value kelas Y : " + value);
    }
}
