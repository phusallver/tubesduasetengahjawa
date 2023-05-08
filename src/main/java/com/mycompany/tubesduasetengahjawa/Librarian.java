/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;
import java.util.Scanner;
import jenisbuku.Novel;

/**
 *
 * @author USER
 */
public class Librarian {
    //attribut
    private String idPegawai;
    private String namaDepan;
    private String namaBelakang;
    private String tanggalLahir;
    private String alamat;
    private String noTelepon;
    
    //method
    public Librarian(String idPegawai, String namaDepan,    //constructor
            String namaBelakang, String tanggalLahir,
            String alamat, String noTelepon){
        this.idPegawai = idPegawai;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }
    public String getID(){
        return this.idPegawai;
    }
    public String getNama(){
        return this.namaDepan+" "+this.namaBelakang;
    }
    public String getTanggalLahir(){
        return this.tanggalLahir;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getNoTelp(){
        return this.noTelepon;
    }
    public void tambahBuku(){
        //uknow
    }
    public void hapusBuku(){
        //uknow
    }
    public void pengembalianBuku(Anggota anggota, String judulBuku){
        //update status buku
        //update quota pinjam
        if (anggota.bukuPinjaman[0]!=null){
            if(anggota.bukuPinjaman[0].getJudulBuku().contains(judulBuku)){
                anggota.bukuPinjaman[0].updateStatusBuku();
                anggota.bukuPinjaman[0] = anggota.bukuPinjaman[1];
                anggota.bukuPinjaman[1] = anggota.bukuPinjaman[2];
                anggota.bukuPinjaman[2] = null;
                anggota.quotaPeminjaman--;
            }
        }else if(anggota.bukuPinjaman[1]!=null){
            if(anggota.bukuPinjaman[1].getJudulBuku().contains(judulBuku)){
                anggota.bukuPinjaman[1].updateStatusBuku();
                anggota.bukuPinjaman[1] = anggota.bukuPinjaman[2];
                anggota.bukuPinjaman[2] = null;
                anggota.quotaPeminjaman--;
            }
        }else if(anggota.bukuPinjaman[2]!=null){
            if(anggota.bukuPinjaman[2].getJudulBuku().contains(judulBuku)){
                anggota.bukuPinjaman[2].updateStatusBuku();
                anggota.bukuPinjaman[2] = null;
                anggota.quotaPeminjaman--;
            }
        }else{
            System.out.println("Buku belum terpinjam");
        }
    }
    public void yuai(Perpus perpus){
        menu();
        Scanner myObj = new Scanner(System.in);
        String pilihan = myObj.nextLine();
        while(!pilihan.contains("0")){
            switch (pilihan){
                case "1" :/*
                    perpus.lisBuku[7] = new Novel("Orang-Orang Biasa", "Andrea Hirata", "Bentang", 2019);
                    break;*/
            }
            menu();
            pilihan = myObj.nextLine();
        }
    }
    public void menu(){
        System.out.println("========================");
        System.out.println("=======Pilih Menu=======");
        System.out.println("==1. tambah buku      ==");
        System.out.println("==2. hapus buku       ==");
        System.out.println("==3. kembalikan buku  ==");
        System.out.println("========================");        
    }
}

