package com.modul2;
import java.util.Scanner;

public class Codelab2 {
    String nama;
    String nim;
    String jurusan;
    public static void tampilUniversitas(){
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public void tampilDataMahasiswa(){
        System.out.print("Nama: " + nama);
        System.out.print(", NIM: " + nim);
        System.out.print(", Jurusan: " + jurusan);
    }
}
class Main{
    public static void main(String[] args){
        Codelab2 tampilan = new Codelab2();
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean data = true;

        while (data == true){
            System.out.println("Menu: ");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1){
                System.out.print("Masukkan nama mahasiswa: ");
                tampilan.nama = input.nextLine();
                System.out.print("Masukkan NIM mahasiswa: ");
                tampilan.nim = input.nextLine();
                System.out.print("Masukkan jurusan mahasiswa: ");
                tampilan.jurusan = input.nextLine();
                System.out.println("Data mahasiswa berhasil ditambahkan.\n");
            } else if (pilihan == 2) {
                Codelab2.tampilUniversitas();
                tampilan.tampilDataMahasiswa();
                System.out.println("\n");
            } else if (pilihan == 3) {
                System.out.println("Thank you for visiting us");
                System.exit(0);
            }
        }

    }
}
