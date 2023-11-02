package com.tugas.dataArray;

public class dataArray {

    public static void main(String[] args) {

        System.out.println("KELASEMEN PREMIERE LEAGUE 2022/2023");

        String[] timbola = {"Manchester City", "Arsenal", "Mancheter United", "Newcastle", "Liverpool" };

        int a = 0;
        a++;

        for (int i = 0; i < timbola.length; i++) {
            System.out.println(a + "." +timbola[i]);
        }
    }
}
