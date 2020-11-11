/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax1;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Minmax1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan total berapa kali input: ");
        int panjangArray=scan.nextInt();
        int angka[]=new int[panjangArray];
        int min,max;
               
        
        for(int i=0;i<panjangArray;i++)
        {
            System.out.print("Masukkan angka ke-"+i+" : ");
            angka[i]=scan.nextInt(); 
        }
        min=angka[0]; 
        max=angka[0];
        System.out.print("Angka - angka yang di inputkan : ");
        for(int i=0;i<panjangArray;i++)
        {
            
        System.out.print(angka[i]+", ");
            if(angka[i]<min)
                min=angka[i];
            if(angka[i]>max)
                max=angka[i];
            
        }
        System.out.println("\nNilai Terkecilnya : "+min+"\nNilai Terbesarnya :"+max);
    }
} 
