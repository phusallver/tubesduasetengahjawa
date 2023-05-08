/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Student extends Anggota{

    public Student(String idAnggota, String namaDepan, String namaBelakang, String tanggalLahir, String alamat, String noTelepon) {
        super(idAnggota, namaDepan, namaBelakang, tanggalLahir, alamat, noTelepon);
    }

    @Override
    public void extendDurasi(Buku buku) {
        buku.updateStatusBuku();
        System.out.println(getNama()+" meminjam kembali buku "+buku.getJudulBuku());
        buku.updateStatusBuku();
    }
        public void yuai(Perpus perpus, Librarian lib){
        menu();
        Scanner myObj = new Scanner(System.in);
        String pilihan = myObj.nextLine();
        String judul;
        Buku bukuPilihan;
        while(!pilihan.contains("0")){
            switch (pilihan){
                case "1" :
                    System.out.println("Buku apa yang anda cari ? ");
                    judul = myObj.nextLine();
                    for (Buku buku : perpus.lisBuku){
                        if (buku == null){
                            System.out.println("Buku "+judul+" tidak tersedia.");
                            break;
                        }else if (buku.getJudulBuku().contains(judul)){
                            System.out.println("Buku "+judul+" sedang "+buku.getStatusPinjam()+".");
                            bukuPilihan = buku;
                            break;
                        }
                    }
                    break;
                case "2" :
                    System.out.println("Buku apa yang mau anda pinjam ? ");
                    judul = myObj.nextLine();
                    for (Buku buku : perpus.lisBuku){
                        if (buku == null){
                            System.out.println("Buku "+judul+" tidak tersedia.");
                            break;
                        }else if (buku.getJudulBuku().contains(judul)){
                            if (buku.getStatusPinjam().contains("terpinjam")){
                                System.out.println("Buku "+judul+" sedang dipinjam.");
                                break;
                            }
                            this.pinjamBuku(buku);
                            System.out.println("Buku "+judul+" terpinjam.");
                            break;
                        }
                    }
                    break;
                case "3" :
                    if(this.bukuPinjaman[0]!=null){
                        System.out.println("Buku apa yang mau anda kembalikan ? ");
                        judul = myObj.nextLine();
                        lib.pengembalianBuku(this, judul);
                    }else{
                        System.out.println("Anda belum meminjam buku!");
                    }
                    break;
                case "4" :
                    if(this.bukuPinjaman[0]!=null){
                        System.out.println("Buku apa yang mau anda perpanjang masa peminjamannya ? ");
                        
                    }else{
                        System.out.println("Anda belum meminjam buku!");
                    }
                    break;
            }
            menu();
            pilihan = myObj.nextLine();
        }
    }
    public void menu(){
        System.out.println("========================");
        System.out.println("=======Pilih Menu=======");
        System.out.println("==1. cari buku        ==");
        System.out.println("==2. pinjam buku      ==");
        System.out.println("==3. kembalikan buku  ==");
        System.out.println("==4. extend durasi    ==");
        System.out.println("========================");
    }
}
