package com.modul1;
import java.util.Scanner;
import java.util.Calendar;

public class Codelab {
    public static void main(String[] args){
        String nama;
        char kelamin;
        int kelahiran, sekarang, umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        nama = objInput.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        kelamin = objInput.next().charAt(0);
        System.out.print("Masukkan Kelahiran (yyyy/mm/dd): ");
        kelahiran = objInput.nextInt();

        Calendar kalender = Calendar.getInstance();
        sekarang = kalender.get(Calendar.YEAR);

        umur = sekarang - kelahiran;
        if(kelamin == 'P' || kelamin == 'p'){
            System.out.println("Nama: " + nama);
            System.out.println("Jenis Kelamin: Perempuan");
            System.out.println("Umur: " + umur);
        } else if (kelamin == 'L' || kelamin == 'l') {
            System.out.println("Nama: " + nama);
            System.out.println("Jenis Kelamin: Laki-Laki");
            System.out.println("Umur: " + umur);
        }
    }
}
