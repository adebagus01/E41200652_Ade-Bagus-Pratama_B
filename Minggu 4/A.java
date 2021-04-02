/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Scanner;

/**
 *
 * @author adeln
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka terkecil : ");
        int Awal = in.nextInt();
        
        System.out.print("Masukkan Angka terbesar : ");
        int Akhir = in.nextInt();
        
        System.out.print("Bilagan genap dari Nilai Diatas adalah : ");
        // variable i untuk menampung nilai awal, proses looping untuk membuat deretan angka dari nilai awal sampai nilai akhir
        for (int i = Awal; i <= Akhir; i++) {
            // hasil looping akan di mod dengan 2 apakah memiliki sisa bagi atau 0
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

    }
    
}
