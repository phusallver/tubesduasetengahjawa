/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

/**
 *
 * @author USER
 */
public class Staff extends Anggota{

    private String jabatan;
    public Staff(String idAnggota, String namaDepan, String namaBelakang, String tanggalLahir, String alamat, String noTelepon, String jabatan) {
        super(idAnggota, namaDepan, namaBelakang, tanggalLahir, alamat, noTelepon);
        this.jabatan = jabatan;
    }

    @Override
    public void extendDurasi(Buku buku) {
        buku.updateStatusBuku();
        System.out.println(getNama()+" ("+this.jabatan+") meminjam kembali buku "+buku.getJudulBuku());
        buku.updateStatusBuku();
    }
}
