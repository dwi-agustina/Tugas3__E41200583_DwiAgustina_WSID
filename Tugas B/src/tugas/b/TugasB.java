/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.b;
import java.util.Scanner;
/**
 *
 * @author axioo
 */
public class TugasB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ini adalah tugas B :");
        System.out.println();

        System.out.println("Masukkan berapa banyak random number yang ingin anda munculkan :");
        Scanner sc = new Scanner(System.in);
        int jumlah = sc.nextInt();

        int[] ar1 = new int[jumlah];
        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random()  * 100);
            System.out.print(ar1[i] + "  ");
        }
        System.out.println();
    }
    
}
