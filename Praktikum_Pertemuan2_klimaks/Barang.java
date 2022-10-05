/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_Pertemuan2_klimaks;

import java.util.Calendar;

/**
 *
 * @author hp
 */
public class Barang {
    String kode;
    String nama;
    String tglProduksi;
    String tglExpired;
    
    public static long masaBarang (Calendar tglProd, Calendar tglExp) {
        long lama = 0;
        Calendar tanggal = (Calendar) tglProd.clone();
        
        while(tanggal.before(tglExp)){
            tanggal.add(Calendar.DAY_OF_MONTH, 1);
            lama++;
        }
        return lama;
        
    }        
}
