/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.e;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
/**
 *
 * @author axioo
 */
public class TugasE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is Task E :");
        System.out.println();
        System.out.println(StringUtils.rightPad("+", 20, "-") + "+");
        System.out.println(StringUtils.center("CAFE CERIA", 20));
        System.out.println(StringUtils.center("ANEKA MINUMAN", 20));
        System.out.println(StringUtils.rightPad("+", 20, "-") + "+");
        System.out.println(StringUtils.center("SPESIAL MENU :", 20));
        System.out.println("1. Soft Drinks");
        System.out.println("2. Mix Juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda Milk");
        System.out.println("5. Tea");
        System.out.println(StringUtils.rightPad( "-", 20, "-"));

        Scanner sc = new Scanner(System.in);
        String namaMinuman;

        System.out.print("Masukkan Nama Pembeli : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                namaMinuman = "Soft Drinks";
                System.out.println("Minuman yang anda pesan adalah " + namaMinuman);
                break;
            case 2:
                namaMinuman = "Mix Juice";
                System.out.println("Minuman yang anda pesan adalah " + namaMinuman);
                break;
            case 3:
                namaMinuman = "Nescafe";
                System.out.println("Minuman yang anda pesan adalah " + namaMinuman);
                break;
            case 4:
                namaMinuman = "Soda Milk";
                System.out.println("Minuman yang anda pesan adalah " + namaMinuman);
                break;
            case 5:
                namaMinuman = "Tea";
                System.out.println("Minuman yang anda pesan adalah " + namaMinuman);
                break;

            default:
                System.out.println("Minuman yang anda pesan tidak terdapat di menu");
        }

        System.out.println();
        System.out.println("Terimakasih " + nama + " Telah berkunjung ke Cafe Ceria");
        System.out.println();
    }
}

    
    

