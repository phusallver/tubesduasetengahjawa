/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

/**
 *
 * @author USER
 */
public class Peminjaman {
    //attribut
    private Buku buku;
    public String tanggalPinjam;
    public String tanggalWajibKembali;
    public String tanggalKembali;
    
    //method
    public Peminjaman(Buku buku, String tanggalSekarang){
        this.buku = buku;
        this.tanggalPinjam = tanggalSekarang;
        //this.tanggalWajibKembali = hariIni
    }
    public String getIDBuku(){
        return this.buku.getIDBuku();
    }
    public void updateStatusBuku(){
        //this.buku.riwayatPinjnam;
    }
}
