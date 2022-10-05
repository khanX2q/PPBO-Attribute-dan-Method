/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author hp
 */
public class ContohException {
    public static void main(String[] args){
        try {
            int hasil = 100/5;
            System.out.println(hasil);
        } catch (Exception e) {
            System.out.println("Hasil error");
        }
    }
}
