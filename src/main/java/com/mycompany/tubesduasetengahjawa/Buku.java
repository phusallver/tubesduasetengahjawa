/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;
import java.time.LocalDateTime;
import java.util.Random;
/**
 *
 * @author USER
 */
public class Buku {
    //attribut
    private String idBuku;
    private String judulBuku;
    protected String kodeBuku;
    private String pengarangBuku;
    private String penerbitBuku;
    private int tahunTerbit;
    private String statusPinjam;
    public String[] riwayatPinjam = new String[10];
    Random rnm = new Random();
    
    //method
    public Buku(String idBuku,String judulBuku,         //constructor
            String pengarangBuku,String penerbitBuku, 
            int tahunTerbit){
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.pengarangBuku = pengarangBuku;
        this.penerbitBuku = penerbitBuku;
        this.tahunTerbit = tahunTerbit;
        this.statusPinjam = "Tersedia";
        int numb = rnm.nextInt(999999);
        this.kodeBuku = String.format("%06d",numb);
    }
    public String getIDBuku(){
        return this.idBuku;
    }
    public String getJudulBuku(){
        return this.judulBuku;
    }
    public String getStatusPinjam(){
        return this.statusPinjam;
    }
    public String getKodeBuku(){
        
        return this.kodeBuku;
    }
    public String getPengarangBuku(){
        return this.pengarangBuku;
    }
    public String getPenerbitBuku(){
        return this.penerbitBuku;
    }
    public int getTahunTerbit(){
        return this.tahunTerbit;
    }
    public void updateStatusBuku(){
        LocalDateTime waktu = LocalDateTime.now();
        String waktuString = waktu.toString().substring(0,10);
        if (this.statusPinjam == "Terpinjam"){
            this.riwayatPinjam[0] += " - " + waktuString;
            this.statusPinjam = "Tersedia";
        }else if(this.statusPinjam == "Tersedia"){
            for(int i = 8; i>-1; i--){
                this.riwayatPinjam[i] = this.riwayatPinjam[i+1];
            }
            this.riwayatPinjam[0] = waktuString;
            this.statusPinjam = "Terpinjam";
        }
    }
}
