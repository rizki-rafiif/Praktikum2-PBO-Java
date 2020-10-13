package com.rizkirafiif.praktikum2.inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        // superclass itu kelas yg mewariskan
        A superclass = new A();
        // subclass itu kelas yang diwariskan
        B subclass = new B();

        System.out.println("Masukin data ke Superclass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printXY();

        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        subclass.sumValue();

    }
}
