/**
 * @author sevgidemir
 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Elma s1 = new Elma();
        s1.manavBilgi();

        Armut s2 = new Armut();
        s2.manavBilgi();

        Kiraz s3 = new Kiraz();
        s3.manavBilgi();

        Meyveler elma = new Elma();
        elma.MeyveAdi();
        System.out.println(elma.MeyveAdi());



        int miktar, hesap, depo_kalan;

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.print("Hangi meyveyi almak istiyorsunuz?\n" + "1-" + Elma.getMeyveAdi() + "\n" + "2-" + Armut.getMeyveAdi() + "\n" + "3-" + Kiraz.getMeyveAdi() + "\n" + "Seçiminiz: ");
            int secim = input.nextInt();

            if (secim > 0 && secim < 4) {

                switch (secim) {
                    case 1:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= Elma.getKg()) {
                            hesap = miktar * Elma.getKgFiyati();
                            System.out.print("Ödeyeceğiniz tutar: " + hesap + " TL");
                            depo_kalan = Elma.getKg() - miktar;
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;

                    case 2:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= Armut.getKg()) {
                            hesap = miktar * Armut.getKgFiyati();
                            System.out.print("Ödeyeceğiniz tutar: " + hesap + " TL");
                            depo_kalan = Armut.getKg() - miktar;
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;

                    case 3:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= Kiraz.getKg()) {
                            hesap = miktar * Kiraz.getKgFiyati();
                            System.out.print("Ödeyeceğiniz tutar: " + hesap + " TL");
                            depo_kalan = Kiraz.getKg() - miktar;
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;


                }
            } else {
                System.out.println("Geçersiz bir sayı girdiniz.");
            }
            System.out.print("\nSistemden çıkmak istiyorsanız f tuşuna basınız, devam etmek istiyorsanız e tuşuna basınız: ");
            String exit = input.next();
            if (exit.equals("f")) {
                break;
            } else if (exit.equals("e")) {
                
            } else System.out.println("Hatalı tuşlama tekrar deneyiniz!");

        }
        System.out.println("Güle güle!");
    }
}*/

/**
 * @author sevgidemir
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("MANAV BİLGİ:");

        Meyveler s1 = new Elma();
        s1.manavBilgi();

        Meyveler s2 = new Armut();
        s2.manavBilgi();

        Meyveler s3 = new Kiraz();
        s3.manavBilgi();


        Meyveler elma = new Elma();
        Meyveler armut = new Armut();
        Meyveler kiraz = new Kiraz();


        int miktar, hesap, depo_elma= elma.Kg(), depo_armut= armut.Kg(), depo_kiraz= kiraz.Kg();

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.print("\nHangi meyveyi almak istiyorsunuz?\n" + "1-" + elma.MeyveAdi() + "\n" + "2-" + armut.MeyveAdi() + "\n" + "3-" + kiraz.MeyveAdi() + "\n" + "\nSeçiminiz: ");
            int secim = input.nextInt();

            if (secim > 0 && secim < 4) {

                switch (secim) {
                    case 1:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= elma.Kg()) {
                            hesap = miktar * elma.KgFiyati();
                            System.out.print("\nÖdeyeceğiniz tutar: " + hesap + " TL");
                            depo_elma -= miktar;
                            if(depo_elma<0) System.out.println("\nDepoda elma kalmamıştır.");
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;

                    case 2:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= armut.Kg()) {
                            hesap = miktar * armut.KgFiyati();
                            System.out.print("\nÖdeyeceğiniz tutar: " + hesap + " TL");
                            depo_armut -= miktar;
                            if(depo_elma<0) System.out.println("\nDepoda armut kalmamıştır.");
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;

                    case 3:
                        System.out.print("Kaç kg aldınız: ");
                        miktar = input.nextInt();

                        if (miktar <= kiraz.Kg()) {
                            hesap = miktar * kiraz.KgFiyati();
                            System.out.print("\nÖdeyeceğiniz tutar: " + hesap + " TL");
                            depo_kiraz -= miktar;
                            if(depo_elma<0) System.out.println("\nDepoda kiraz kalmamıştır.");
                        } else System.out.println("Depoda istediğiniz miktarda ürün yok.");

                        break;

                }
            } else {
                System.out.println("Geçersiz bir sayı girdiniz.");
            }
            System.out.print("\nSistemden çıkmak istiyorsanız f tuşuna basınız, devam etmek istiyorsanız e tuşuna basınız: ");
            String exit = input.next();
            if (exit.equals("f")) {
                break;
            } else if (exit.equals("e")) {

            } else System.out.println("Hatalı tuşlama tekrar deneyiniz!");

        }
        System.out.println("Güle güle!");
    }
}

