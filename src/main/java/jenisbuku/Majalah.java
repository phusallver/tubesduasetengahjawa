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
public class Majalah extends Buku implements GenerateCode{
    private String tipe;

    public Majalah(String idBuku, String judulBuku, String pengarangBuku, String penerbitBuku, int tahunTerbit) {
        super(idBuku, judulBuku, pengarangBuku, penerbitBuku, tahunTerbit);
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public String getTipe(){
        return this.tipe;
    }
    @Override
    public void GenerateCode() {
        super.kodeBuku = "MJL"+super.kodeBuku;
    }
}
