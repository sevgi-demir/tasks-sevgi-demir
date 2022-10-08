
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author sevgidemir
 */
public class AnadoluJet extends HavaYoluSirketleri implements IAvantajlar{

        public AnadoluJet() {
            super(sirketAdi,  businessUcret,  ekonomiUcret);
        }

        @Override
        public void yemekServisi() {
            System.out.println("Yurt dışı uçuşlarımızda yemek servisimiz mevcuttur.");
        }

        @Override
        public String SirketAdi() {
        return sirketAdi="Anadolu JET";
    }

        @Override
        public double EkonomiUcret() {
        return ekonomiUcret=700;
    }


        public void Islemler() {

            LinkedList<String> secilen_koltuklar = new LinkedList<>();


            String koltukNo;
            int sayac = 0;

            LinkedList<String> list = new LinkedList<>();
            list.add("A1");
            list.add("A2");
            list.add("A3");
            list.add("A4");
            list.add("A5");
            list.add("A6");
            list.add("B1");
            list.add("B2");
            list.add("B3");
            list.add("B4");
            list.add("B5");
            list.add("B6");
            list.add("C1");
            list.add("C2");
            list.add("C3");
            list.add("C4");
            list.add("C5");
            list.add("C6");
            list.add("D1");
            list.add("D2");
            list.add("D3");
            list.add("D4");
            list.add("D5");
            list.add("D6");

            Scanner input = new Scanner(System.in);
            System.out.println("\nKoltuklar: " + list.toString().replace("[","").replace("]","").replace(",",""));

            System.out.println("\n      KOLTUKLAR");

            int counter=1;
            for (String item: list) {   // Tüm koltuklar item string'ine atandı. Döngü ile tek tek yazıldı. Boşluk bırakma ve alt satıra geçme işlemleri yapıldı.
                if(counter%6==0) {
                    System.out.println(item);
                    counter=1;
                } else if (counter%3==0) {
                    System.out.print(item + "     ");
                    counter++;
                } else {
                    System.out.print(item + " ");
                    counter++;
                }
            }


            while (true) {
                System.out.print("\n Koltuk numarası seçiniz: ");
                koltukNo = input.next();

                boolean koltuk_izin=false;
                for(String item: list){   // Tüm koltuklar item stringine atandı. Aynı koltuğun tekrar seçilmesi ve yanlış koltuk ismi ile alım engellendi.
                    if(item.equals(koltukNo))
                    {
                        koltuk_izin=true;
                        break;
                    }
                }

                if(koltuk_izin) {
                System.out.print("\nKoltuk seçimini sonlandırmak istiyorsanız 1 tuşuna basınız, devam etmek istiyorsanız 2 tuşuna basınız: ");
                String exit = input.next();


                secilen_koltuklar.add(sayac, koltukNo);


                if (exit.equals("1")) {

                    System.out.println("\n Seçtiğiniz koltuklar: " + secilen_koltuklar.toString().replace("[","").replace("]",""));

                    break;

                } else if (exit.equals("2")) {

                    sayac++;
                    counter=1;
                    int sira = 0;
                    System.out.println("\n      KOLTUKLAR");
                    for (String item : list) {
                        if (item.equals(koltukNo)) { // Seçili koltuk geldiyse bu döngüye girerek o koltuk silinir (aslında iki boşluk ile değiştirilir)
                            if(counter % 6 == 0) {
                                System.out.print("\n");
                            }
                            else if(counter%3==0)
                            {
                                System.out.print("       ");
                            } else { System.out.print("   "); }
                            counter++;
                            list.set(sira, "  ");
                            sira++;
                        } else if (counter % 6 == 0) { // Seçili koltuk değilse ve altıncı koltuksa direkt yazdır.
                            System.out.println(item);
                            counter = 1;
                            sira++;
                        }
                        else if(counter%3==0) // Seçili koltuk değilse ve üçüncü koltuksa direkt yazdır.
                        {
                            System.out.print(item + "     ");
                            counter++;
                            sira++;
                        } else { // Seçili koltuk değilse ve birinci, ikinci, dördüncü, beşinci koltuksa direkt yazdır.
                            System.out.print(item + " ");
                            counter++;
                            sira++;
                        }
                    }
                } else System.out.println("\nHatalı tuşlama tekrar deneyiniz!");

            } else System.out.println("\nHatalı tuşlama tekrar deneyiniz!");
            }

            int kac_koltuk=secilen_koltuklar.size();
                 System.out.print("\n Seçilen koltuk sayısı: " + kac_koltuk);

                 double ucret=kac_koltuk*EkonomiUcret();
                 System.out.print("\n\n Ödenecek tutar: " + ucret + " TL");



    }


}
