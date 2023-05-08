/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import com.mycompany.tubesduasetengahjawa.Buku;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class NamaComparator implements Comparator<Buku>{
    @Override
    public int compare(Buku o1, Buku o2) {
        return o1.getTahunTerbit() - o2.getTahunTerbit();
    }
}
