package com.rizkirafiif.praktikum2.vmi;

public class DemoVMI {
    public static void main(String[] args) {
        // objek child dari kelas Child
        Child c = new Child();
        // objek parent dgn data dari kelas child
        Parent pC = new Child();

        // panggil method
        // hasilnya akan sesuai dengan data dari kelas child
        c.getData();
        pC.getData();

        /*
        VMI bisa terjadi bila method dari kelas parent
        di define ulang datanya di kelas child
        dan nantinya objek dari kelas parent juga mengambil dari
        data kelas child nya
        */
    }
}
