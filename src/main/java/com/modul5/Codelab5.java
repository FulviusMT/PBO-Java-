package com.modul5;
import java.util.ArrayList;
import java.util.Scanner;

public class Codelab5 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        Scanner inputan = new Scanner(System.in);

        while (true){
            int i = 0;
            i++;
            System.out.print("Masukkan Nama ke-" + i + " = ");
            String nama = inputan.nextLine();

            if (nama.equalsIgnoreCase("Selesai")){
                break;
            }

            try {
                if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                names.add(nama);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nDaftar mahasiswa yang diinputkan:");
        for (String nama : names) {
            System.out.println("- " + nama);
        }
        inputan.close();
    }
}
