/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubesduasetengahjawa;

import jenisbuku.Novel;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tubesduasetengahjawa {

    public static void main(String[] args) { //curently testing
        System.out.println("========================");
        System.out.println("=====Login Sebagai======");
        System.out.println("==1. pustakawan       ==");
        System.out.println("==2. staff            ==");
        System.out.println("==3. murid            ==");
        System.out.println("========================");
        /*
        Scanner myObj = new Scanner(System.in);
        String pilihan = myObj.nextLine();
        
        Librarian user1 = new Librarian("iukuk", "ukno",
                "rifers", "23/2/1995",
                "Home", "085712344321");
        Staff user2 = new Staff("iykyk","ano",
                "ne","25/12/2000",
                "Homa","08923812923","boss");
        Student user3 = new Student("iynyn","ina",
                "kuta","5/5/2000",
                "Hima","082198762345");
        */
        Perpus perpus = new Perpus();
        perpus.tambahBuku(new Novel("Maryamah Karpov", "Andrea Hirata", "Bentang", 2008));
        perpus.tambahBuku(new Novel("Padang Bulan", "Andrea Hirata", "Bentang", 2010));
        perpus.tambahBuku(new Novel("Sebelas Ptriot", "Andrea Hirata", "Bentang", 2011));
        perpus.tambahBuku(new Novel("Laskar Pelangi", "Andrea Hirata", "Bentang", 2005));
        perpus.tambahBuku(new Novel("Sang Pemimpi", "Andrea Hirata", "Bentang", 2006));
        perpus.tambahBuku(new Novel("Edensor", "Andrea Hirata", "Bentang", 2007));
        perpus.tambahBuku(new Novel("Cinta di Dalam Gelas", "Andrea Hirata", "Bentang", 2011));
        perpus.tambahBuku(new Novel("Orang-Orang Biasa", "Andrea Hirata", "Bentang", 2019));
        
        perpus.printLisBuku();
        System.out.println("\nBuku setelah diurut :\n");
        perpus.urutkanSesuaiTahunTerbit();
        perpus.printLisBuku();
        
        /*switch(pilihan){
            case "1" :
                user1.yuai(perpus);
                break;
            case "2" :
                user2.yuai(perpus, user1);
                break;
            case "3" :
                user3.yuai(perpus, user1);
                break;
        }*/
    }
}
