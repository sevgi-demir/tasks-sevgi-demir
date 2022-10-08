
/**
 * @author sevgidemir
 */
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        THY thy = new THY();
        Pegasus pegasus = new Pegasus();
        AnadoluJet anadoluJet = new AnadoluJet();

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("\nHangi hava yolu şirketini seçiyorsunuz?\n" + "1-" + thy.SirketAdi() +
                    "\n" + "2-" + pegasus.SirketAdi() + "\n" + "3-" + anadoluJet.SirketAdi() + "\n" + "\nSeçiminiz: ");
            int secim = input.nextInt();

            if (secim > 0 && secim < 4) {

                switch (secim) {
                    case 1:
                        System.out.println("\nBİLGİLENDİRME");
                        thy.yemekServisi();
                        thy.Islemler();
                        break;

                    case 2:
                        System.out.println("\nBİLGİLENDİRME");
                        pegasus.yemekServisi();
                        pegasus.Islemler();
                        break;

                    case 3:
                        System.out.println("\nBİLGİLENDİRME");
                        anadoluJet.yemekServisi();
                        anadoluJet.Islemler();

                        break;

                }

            } else {
                System.out.println("Geçersiz bir sayı girdiniz.");
            }
            System.out.print("\nSistemden çıkmak istiyorsanız 0 tuşuna basınız, devam etmek istiyorsanız 5 tuşuna basınız: ");
            String exit = input.next();
            if (exit.equals("0")) {
                break;
            } else if (exit.equals("5")) {

            } else System.out.println("Hatalı tuşlama tekrar deneyiniz!");

        }
            System.out.println("Güle güle!");
    }
}

