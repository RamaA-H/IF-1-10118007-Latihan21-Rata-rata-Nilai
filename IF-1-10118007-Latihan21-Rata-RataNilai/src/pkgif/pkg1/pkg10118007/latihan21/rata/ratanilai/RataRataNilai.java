/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan21.rata.ratanilai;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Rata-Rata Nilai Mahasiswa
 * @author Rama
 */
public class RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i, totalMahasiswa;
        double Total;
        double nilai;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        totalMahasiswa = masuk.nextInt();

        i = 1;
        Total = 0;

        while (i <= totalMahasiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = masuk.nextDouble();
            Total += nilai;

            i++;
        }

        System.out.println("\nMaka,Rata-rata Nilainya adalah " + Total / totalMahasiswa);
    }
    
}
