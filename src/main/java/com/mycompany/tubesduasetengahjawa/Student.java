/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

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
}
