package BirinciHafta;

/**
 * 200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
 *
 */

public class ToplamBulma {
    public static void main(String[] args) {
        int toplam=0, sayac;
        for(int i=200; i<500; i++) {
            sayac=0;
            if(i%3==0) {
                sayac++;

            }
            if(sayac==0) {
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}

