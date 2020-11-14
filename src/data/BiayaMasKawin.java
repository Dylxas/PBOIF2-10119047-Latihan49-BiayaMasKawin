/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM ITUNG BIAYA MAS KAWIN
 */

public class BiayaMasKawin {
    private double totalBerat;
    private double hargaGram;
    
    public BiayaMasKawin(double totalBerat, double hargaGram){
       this.totalBerat = totalBerat;
       this.hargaGram = hargaGram;
    }
    
    public double getTotalBerat(){
        return totalBerat;
    }
    
    public double getHargaGram(){
        return hargaGram;
    }
    
    private double totalHarga(double totalBerat, double hargaGram){
        return totalBerat * hargaGram;
    }
    
    public void tampilData(double totalBerat, double hargaGram){
        System.out.println("-----Program Biaya Mas Kawin----");
        System.out.println("Total Mas Kawin : " + totalBerat);
        System.out.printf("Harga Mas Kawin Per Gram : Rp. " + "%.0f\n", hargaGram);
        System.out.printf("Total Mas Kawin Yang Harus Dibayar : Rp. " + "%.0f\n", totalHarga(totalBerat, hargaGram));
    }
}
