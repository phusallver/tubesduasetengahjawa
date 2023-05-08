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
    private String judulBuku;
    protected String kodeBuku;
    private String pengarangBuku;
    private String penerbitBuku;
    private int tahunTerbit;
    private String statusPinjam;
    private String waktuKembali;
    public String[] riwayatPinjam = new String[10];
    Random rnm = new Random();
    private int denda;
    
    //method
    public Buku(String judulBuku,         //constructor
            String pengarangBuku,String penerbitBuku, 
            int tahunTerbit){
        this.judulBuku = judulBuku;
        this.pengarangBuku = pengarangBuku;
        this.penerbitBuku = penerbitBuku;
        this.tahunTerbit = tahunTerbit;
        this.statusPinjam = "tersedia";
        int numb = rnm.nextInt(999999);
        this.kodeBuku = String.format("%06d",numb);
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
        if (this.statusPinjam.contains("terpinjam")){
            this.waktuKembali = null;
            this.riwayatPinjam[0] += " - " + waktuString;
            this.statusPinjam = "tersedia";
        }else if(this.statusPinjam.contains("tersedia")){
            LocalDateTime waktuBalik = waktu.plusDays(7);
            this.waktuKembali = waktuBalik.toString().substring(0,10);
            for(int i = 8; i>-1; i--){
                this.riwayatPinjam[i] = this.riwayatPinjam[i+1];
            }
            this.riwayatPinjam[0] = waktuString;
            this.statusPinjam = "terpinjam";
        }
    }
}
