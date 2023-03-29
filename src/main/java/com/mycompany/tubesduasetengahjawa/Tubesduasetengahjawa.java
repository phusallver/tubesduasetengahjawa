/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubesduasetengahjawa;

import jenisbuku.Kamus;

/**
 *
 * @author USER
 */
public class Tubesduasetengahjawa {

    public static void main(String[] args) { //curently testing
        /*Librarian missHoney = new Librarian("sue", "Sue",
            "-san", "2001-01-01",
            "ur home", "maw tau ajh");
        Anggota kangPinjem = new Anggota("suii", "Siti",     //constructor
            "nurafifa", "2013-02-03",
            "my home", "tau dong");
        Buku laskarPelangi = new Buku("FIK1232","Laskar Pelangi",         //constructor
            "LSKRPLNGi", "Andrea Hirata",
            "Gramedia", 2008);
        Buku sangPemimpi = new Buku("FIK1232","Sang Pemimpi",         //constructor
            "LSKRPLNGi", "Andrea Hirata",
            "Gramedia", 2008);
        Buku edensor = new Buku("FIK1232","Edensor",         //constructor
            "LSKRPLNGi", "Andrea Hirata",
            "Gramedia", 2008);
        Buku heriPoter = new Buku("FIK1232","Heripoter",         //constructor
            "LSKRPLNGi", "Andrea Hirata",
            "Gramedia", 2008);
        kangPinjem.pinjamBuku(laskarPelangi);
        kangPinjem.pinjamBuku(sangPemimpi);
        kangPinjem.pinjamBuku(edensor);
        kangPinjem.pinjamBuku(heriPoter);
        System.out.println(laskarPelangi.getStatusPinjam());
        System.out.println(laskarPelangi.riwayatPinjam[0]);
        kangPinjem.pinjamBuku(laskarPelangi);
        missHoney.pengembalianBuku(kangPinjem, "Laskar Pelangi");
        System.out.println(laskarPelangi.getStatusPinjam());
        System.out.println(laskarPelangi.riwayatPinjam[0]);*/
        
        Kamus IndoJawa = new Kamus("Kamus Indo Jawa",         //constructor
            "INDOJAWA", "John M. Echols",
            "Gramedia", 2008);
        IndoJawa.setBahasa("Indo", "Jawa");
        System.out.println(IndoJawa.getKodeBuku());
    }
}
