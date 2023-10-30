import java.util.Scanner;

/**
 * @author wulan
 */

/**
 * 
 */
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Meminta pengguna untuk memasukkan panjang dan lebar
          */
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        /**
         * Menghitung luas persegi panjang
         */
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);

        input.close();
    }
}