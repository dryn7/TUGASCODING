package com.tugas.perulangan1000;

public class perulangan1000 {

    public static void main(String[] args) {

        String name = "I Nyoman Dimas Kresna Adryan";
        String NPM = "G1A023077";

        System.out.println("Nama =" + name);
        System.out.println("NPM  =" + NPM);

        for (int i = 0; i <= 100; i++) {

            if (i >= 10){
                System.out.println(name);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
