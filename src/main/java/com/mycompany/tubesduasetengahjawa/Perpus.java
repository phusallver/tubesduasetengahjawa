/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesduasetengahjawa;

import Comparator.NamaComparator;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author USER
 */
public class Perpus {
    public ArrayList<Buku> lisBuku;
    public Perpus(){
        lisBuku = new ArrayList<Buku>();
    }
    public void tambahBuku(Buku buku){
        lisBuku.add(buku);
    }
    public void hapusBuku(String judulBuku){
        for(Buku buk : lisBuku){
            if (buk.getJudulBuku().equals(judulBuku)){
                lisBuku.remove(buk);
            }
        }
    }
    public void urutkanSesuaiTahunTerbit(){
        Collections.sort(lisBuku, new NamaComparator());
    }
    public void urutkanSesuaiNama(){
        Collections.sort(lisBuku);
    }
    public void printLisBuku(){
        System.out.println("Berikut daftar lis buku : ");
        int i = 1;
        for (Buku buku : lisBuku){
            System.out.println(i+". "+buku.getJudulBuku()+"("+buku.getTahunTerbit()+")");
            i++;
        }
    }
}
