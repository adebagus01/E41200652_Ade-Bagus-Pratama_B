/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adeln
 */
public class C {
    public static void main(String[] args) { 
        
       Scanner in = new Scanner(System.in);
       int nilai;
       double hasil = 0; 
       double rata_rata = 0;
       
       System.out.print("Masukkan banyaknya data nilai = ");
       nilai = in.nextInt();
       int[] Arr = new int[nilai];
        
        for (int i = 0; i < nilai; i++) {
            int a = 1 + i;
            System.out.print("Masukkan Data Nilai ke " + a + " = ");
            Arr[i] = in.nextInt();
        }
        Arrays.sort(Arr);
        
        int max = Arr[0];
        int min = Arr[0];
        
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");

            if (max < Arr[i]) {
                max = Arr[i];

            }
            else {
                min = Arr[i];
            }
         }
        
            for (int i = 0; i < Arr.length; i++) {
                double jumlah = Arr[i];
                rata_rata += jumlah ;    
            }
            
            System.out.println("--------------------------------");
            System.out.println("Nilai Max = " +max);
            System.out.println("Nilai Min = " +min);    
            System.out.println("Nilai Rata Rata = " +rata_rata/nilai);  
        }
    }
  

