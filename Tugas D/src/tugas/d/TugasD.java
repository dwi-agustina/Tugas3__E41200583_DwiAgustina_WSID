/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.d;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 *
 * @author axioo
 */
public class TugasD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nama;
        int harga1, harga2, harga3, harga4, harga5, total;

        System.out.println("ini adalah tugas D :");
        System.out.println();

        System.out.println(StringUtils.rightPad( "-", 30, "-"));
        System.out.println(StringUtils.center("Kharisma Agung Plaza <KAP>", 30));
        System.out.println(StringUtils.center("Promo Belanja Berhadiah", 30));
        System.out.println(StringUtils.center("Khusus Pembelian 5 Barang Pertama", 30));
        System.out.println(StringUtils.center("Dengan Harga Minimum Rp 10.000,00", 30));
        System.out.println(StringUtils.rightPad( "-", 30, "-"));
        System.out.print("Masukkan Nama Pembeli : ");
        nama = sc.nextLine();
        System.out.println();

        System.out.println("Masukkan Harga Barang 1 : ");
        harga1 = sc.nextInt();
        System.out.println("Masukkan Harga Barang 2 : ");
        harga2 = sc.nextInt();
        System.out.println("Masukkan Harga Barang 3 : ");
        harga3 = sc.nextInt();
        System.out.println("Masukkan Harga Barang 4 : ");
        harga4 = sc.nextInt();
        System.out.println("Masukkan Harga Barang 5 : ");
        harga5 = sc.nextInt();

        total = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total pembelian atas nama " + nama + " adalah " + "Rp." + total);

        if (total > 50000){
            System.out.println("Selamat...");
            System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        }

        System.out.println(StringUtils.rightPad( "-", 30, "-"));
        System.out.println(StringUtils.center("Terima Kasih", 30));
        System.out.println(StringUtils.center("Anda sudah berbelanja di Kharisma Agung Plaza", 30));
        System.out.println();
    }
}

    
    

