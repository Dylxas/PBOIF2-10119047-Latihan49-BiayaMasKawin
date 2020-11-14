/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan49.biayamaskawin;
import data.BiayaMasKawin;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM ITUNG BIAYA MAS KAWIN
 */

public class PBOIF210119047Latihan49BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaMasKawin biayaMasKawin = new BiayaMaskawin(15.7,570000);
        biayaMasKawin.tampilData(biayaMasKawin.getTotalBerat(), biayaMasKawin.getHargaGram());
    }
    
}
