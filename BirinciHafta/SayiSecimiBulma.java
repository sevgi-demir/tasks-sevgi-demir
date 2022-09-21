package BirinciHafta;

/**
 * 0 ile 500 aralığında ve
 * Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
 * 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
 */

import java.util.Random;

public class SayiSecimiBulma {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 1; i <1000 ; i++) {
            int sayi = r.nextInt(500);
            if (sayi > 50 && sayi < 100) {

                System.out.println( sayi + " sayısı" + " " + i + ".adımda bulundu");
                break;
            }
        }
    }}
