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
public class Kamus extends Buku implements GenerateCode{
    private String bahasa1;
    private String bahasa2;

    public Kamus(String judulBuku, String pengarangBuku, String penerbitBuku, int tahunTerbit) {
        super(judulBuku, pengarangBuku, penerbitBuku, tahunTerbit);
        GenerateCode();
    }
    public void setBahasa(String bahasa1, String bahasa2){
        this.bahasa1 = bahasa1;
        this.bahasa2 = bahasa2;
    }
    public String getBahasa(){
        return this.bahasa1 + " & " + this.bahasa2;
    }
    @Override
    public void GenerateCode() {
        super.kodeBuku = "KAM"+super.kodeBuku;
    }
}
