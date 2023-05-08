/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

/**
 *
 * @author USER
 */
public abstract class Anggota {
    //attribut
    private String idAnggota;
    private String namaDepan;
    private String namaBelakang;
    private String tanggalLahir;
    private String alamat;
    public String noTelepon;
    public int quotaPeminjaman;
    public Buku[] bukuPinjaman = new Buku[3];
    
    //method
    public Anggota(String idAnggota, String namaDepan,     //constructor
            String namaBelakang, String tanggalLahir,
            String alamat, String noTelepon){
        this.idAnggota = idAnggota;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.quotaPeminjaman = 3;
        this.bukuPinjaman[0] = null;
        this.bukuPinjaman[1] = null;
        this.bukuPinjaman[2] = null;
    }
    public String getID(){
        return this.idAnggota;
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
    public void pinjamBuku(Buku buku){
        if (buku.getStatusPinjam().contains("tersedia")){
            if (this.quotaPeminjaman > 0){
                this.bukuPinjaman[3-this.quotaPeminjaman] = buku;
                this.quotaPeminjaman--;
                buku.updateStatusBuku();
            }else{
                System.out.println("Kuota peminjaman sudah habis, "
                        + "kembalikan dulu buku yang lama");
            }
        }else{
            System.out.println("Buku sedang tidak tersedia");
        }
    }
    public abstract void extendDurasi(Buku buku);
}
