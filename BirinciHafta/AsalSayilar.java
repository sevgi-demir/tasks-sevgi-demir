package BirinciHafta;

/**
 * 3 ile 100 arasında asal sayıların toplamını bulan program.
 */


public class AsalSayilar {
    public static void main(String[] args) {

        int  sayac, toplam = 0;

        for(int i = 3; i < 100; i++) {
            sayac = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    sayac++;

                }
            }
            if(sayac == 0 && i != 1 ) {
                toplam+= i;
            }
        }
        System.out.println("3'ten 100'e kadar olan asal sayıların toplamı = " + toplam);
    }
}
