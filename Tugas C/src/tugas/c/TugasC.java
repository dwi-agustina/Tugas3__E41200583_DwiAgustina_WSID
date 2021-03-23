/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.c;

/**
 *
 * @author axioo
 */
public class TugasC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("This is Task C :");
        System.out.println();

        //        Tugas 3
        int[][] angka = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };

        for (int i = 0; i<4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}

