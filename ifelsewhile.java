package com.tugas.ifelsewhile;
import java.util.Scanner;
public class ifelsewhile {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("batas bawah =");
        int batasbawah = input.nextInt();
        System.out.println("batas atas  =");
        int batasatas = input.nextInt();

        int angka = batasbawah;


            while (angka<=batasatas)
            {
                if (angka % 2 == 0){
                    System.out.println( "angka "+ angka + " adalah bilangan genap");
                }
                else{
                    System.out.println( "angka " + angka + " adalah bilangan ganjil");
                }
                angka++;
            }




            }
        }




