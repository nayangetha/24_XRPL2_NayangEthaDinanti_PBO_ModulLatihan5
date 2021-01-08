/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_5;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Latihan_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner masukan = new Scanner(System.in);
        //Deklarasi variabel lokal
        int nilai;
        //Input data dalam variabel oleh user 
        System.out.print("Masukkan nilai akhir PBO :");
        nilai = masukan.nextInt();
        //Pernyataan if untuk menentuan kelulusan siswa
        if (nilai < 70)
            System.out.println("Siswa Tidak Lulus");
        if (nilai > 70)
            System.out.println("Siswa Lulus");
    }
    
}
