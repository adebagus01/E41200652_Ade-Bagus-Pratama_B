/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import java.util.Scanner;


/**
 *
 * @author adeln
 */
public class RandomArray {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        
        System.out.print("Masukan jumlah Deret Array yang diinginkan : ");
        jumlah = input.nextInt();
        
        int[] deret = new int [jumlah];
        
        for (int i=0; i<jumlah; i++){
            deret[i]=(int) (Math.random() * 10);
        }
        
        for (int a=0; a<jumlah; a++){
            System.out.print(deret[a]+"\t");
        }
    }
        
}
