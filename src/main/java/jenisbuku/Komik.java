/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenisbuku;

import com.mycompany.tubesduasetengahjawa.Buku;
import com.mycompany.tubesduasetengahjawa.GenerateCode;

/**
 *
 * @author USER
 */
public class Komik extends Buku implements GenerateCode{
    private String genre;

    public Komik(String idBuku, String judulBuku, String pengarangBuku, String penerbitBuku, int tahunTerbit) {
        super(idBuku, judulBuku, pengarangBuku, penerbitBuku, tahunTerbit);
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
    @Override
    public void GenerateCode() {
        super.kodeBuku = "KMK"+super.kodeBuku;
    }
}