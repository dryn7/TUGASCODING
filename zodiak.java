package com.tugas.zodiak;

import java.util.Scanner;
public class zodiak {

    public static void main(String[] args) {

        System.out.println("CARI TAHU ZODIAK MU");
        System.out.println("===================");

        Scanner input = new Scanner(System.in);

            System.out.println("nama =");
            String nama = input.next();
            System.out.println("tanggal lahir");
            int tanggal = input.nextInt();
            System.out.println("bulan lahir");
            int bulan = input.nextInt();

            if (bulan == 3 & tanggal >= 21) {
                System.out.println("Zodiak kamu adalah = Aries");
            } else if (bulan == 4 & tanggal <= 19) {
                System.out.println("Zodiak kamu adalah = Aries");
            } else if (bulan == 4 & tanggal >= 20) {
                System.out.println("Zodiak kamu adalah = Taurus");
            } else if (bulan == 5 & tanggal <= 20) {
                System.out.println("Zodiak kamu adalah = Taurus");
            } else if (bulan == 5 & tanggal >= 21) {
                System.out.println("Zodiak kamu adalah = Gemini");
            } else if (bulan == 6 & tanggal <= 20) {
                System.out.println("Zodiak kamu adalah = Gemini");
            } else if (bulan == 6 & tanggal >= 21) {
                System.out.println("Zodiak kamu adalah = Cancer");
            } else if (bulan == 7 & tanggal <= 22) {
                System.out.println("Zodiak kamu adalah = Cancer");
            } else if (bulan == 7 & tanggal >= 23) {
                System.out.println("Zodiak kamu adalah = Leo");
            } else if (bulan == 8 & tanggal <= 22) {
                System.out.println("Zodiak kamu adalah = Leo");
            } else if (bulan == 8 & tanggal >= 23) {
                System.out.println("Zodiak kamu adalah = Virgo");
            } else if (bulan == 9 & tanggal <= 22) {
                System.out.println("Zodiak kamu adalah = Virgo");
            } else if (bulan == 9 & tanggal >= 23) {
                System.out.println("Zodiak kamu adalah = Libra");
            } else if (bulan == 10 & tanggal <= 22) {
                System.out.println("Zodiak kamu adalah = Libra");
            } else if (bulan == 10 & tanggal >= 23) {
                System.out.println("Zodiak kamu adalah = Scorpio");
            } else if (bulan == 11 & tanggal <= 21) {
                System.out.println("Zodiak kamu adalah = Scorpio");
            } else if (bulan == 11 & tanggal >= 22) {
                System.out.println("Zodiak kamu adalah = Sagitarius");
            } else if (bulan == 12 & tanggal <= 21) {
                System.out.println("Zodiak kamu adalah = Sagitarius");
            } else if (bulan == 12 & tanggal >= 22) {
                System.out.println("Zodiak kamu adalah = Capricorn");
            } else if (bulan == 1 & tanggal <= 19) {
                System.out.println("Zodiak kamu adalah = Capricorn");
            } else if (bulan == 1 & tanggal >= 20) {
                System.out.println("Zodiak kamu adalah = Aquarius");
            } else if (bulan == 2 & tanggal <= 18) {
                System.out.println("Zodiak kamu adalah = Aquarius");
            } else if (bulan == 2 & tanggal >= 19) {
                System.out.println("Zodiak kamu adalah = Pisces");
            } else if (bulan == 3 & tanggal <= 20) {
                System.out.println("Zodiak kamu adalah = Pisces");
            } else {
                System.out.println("zodiak kamu tidak ditemukan :(");
            }
            System.out.println("=========================");
            System.out.println("TERIMAKASIH");


        }
    }



