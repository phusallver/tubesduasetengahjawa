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
public class Literatur extends Buku implements GenerateCode{
    private String tema;

    public Literatur(String judulBuku, String pengarangBuku, String penerbitBuku, int tahunTerbit) {
        super(judulBuku, pengarangBuku, penerbitBuku, tahunTerbit);
    }
    public void getTema(String tema){
        this.tema = tema;
    }
    public String getTema(){
        return this.tema;
    }
    @Override
    public void GenerateCode() {
        super.kodeBuku = "LTR"+super.kodeBuku;
    }
}
