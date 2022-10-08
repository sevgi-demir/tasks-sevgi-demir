
/**
 * @author sevgidemir
 */
import java.util.LinkedList;
import java.util.Scanner;

public class THY extends HavaYoluSirketleri implements IAvantajlar {

        public THY() {
                super(sirketAdi, businessUcret,ekonomiUcret);
        }

        @Override
        public void yemekServisi() {
            System.out.println("Yurt içi ve yurt dışı uçuşlarımızda yemek servisimiz mevcuttur.");
        }

        @Override
        public String SirketAdi() {
                return sirketAdi="THY";
        }

        @Override
        public double BusinessUcret() {
                return businessUcret=1200;
        }

        @Override
        public double EkonomiUcret() {
        return ekonomiUcret=800;
    }


        public void Islemler() {

            LinkedList<String> secilen_koltuklar = new LinkedList<>();
            LinkedList<String> secilen_koltuklar2 = new LinkedList<>();

            String koltukNo;
            int sayac = 0,business_koltuk = 0, ekonomi_koltuk=0;

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
            //System.out.println("\nKoltuklar: " + list.toString().replace("[","").replace("]","").replace(",",""));

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
                System.out.println("\nA1,A2,A3,A4,A5,A6 koltuklarımız business, geri kalan koltuklarımız ekonomi sınıfına aittir. ");
                System.out.print("\nKoltuk numarası seçiniz: ");
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
                secilen_koltuklar2.add(sayac, koltukNo);


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
                }
                else System.out.println("\nHatalı tuşlama tekrar deneyiniz!");
            }


        if(secilen_koltuklar.contains("A1") || secilen_koltuklar.contains("A2") || secilen_koltuklar.contains("A3")
            || secilen_koltuklar.contains("A4") || secilen_koltuklar.contains("A5") || secilen_koltuklar.contains("A6")) {
            secilen_koltuklar.remove("B1");
            secilen_koltuklar.remove("B2");
            secilen_koltuklar.remove("B3");
            secilen_koltuklar.remove("B4");
            secilen_koltuklar.remove("B5");
            secilen_koltuklar.remove("B6");
            secilen_koltuklar.remove("C1");
            secilen_koltuklar.remove("C2");
            secilen_koltuklar.remove("C3");
            secilen_koltuklar.remove("C4");
            secilen_koltuklar.remove("C5");
            secilen_koltuklar.remove("C6");
            secilen_koltuklar.remove("D1");
            secilen_koltuklar.remove("D2");
            secilen_koltuklar.remove("D3");
            secilen_koltuklar.remove("D4");
            secilen_koltuklar.remove("D5");
            secilen_koltuklar.remove("D6");

            business_koltuk= secilen_koltuklar.size();

        }  if (secilen_koltuklar2.contains("B1") || secilen_koltuklar2.contains("B2") || secilen_koltuklar2.contains("B3")
                || secilen_koltuklar2.contains("B4") || secilen_koltuklar2.contains("B5") || secilen_koltuklar2.contains("B6")
                || secilen_koltuklar2.contains("C1") || secilen_koltuklar2.contains("C2") || secilen_koltuklar2.contains("C3")
                || secilen_koltuklar2.contains("C4") || secilen_koltuklar2.contains("C5") || secilen_koltuklar2.contains("C6")
                || secilen_koltuklar2.contains("D1") || secilen_koltuklar2.contains("D2") || secilen_koltuklar2.contains("D3")
                || secilen_koltuklar2.contains("D4") || secilen_koltuklar2.contains("D5") || secilen_koltuklar2.contains("D6")) {
            secilen_koltuklar2.remove("A1");
            secilen_koltuklar2.remove("A2");
            secilen_koltuklar2.remove("A3");
            secilen_koltuklar2.remove("A4");
            secilen_koltuklar2.remove("A5");
            secilen_koltuklar2.remove("A6");

            ekonomi_koltuk= secilen_koltuklar2.size();

        }


        double ucret= (business_koltuk*BusinessUcret()) + (ekonomi_koltuk*EkonomiUcret());
        System.out.println("\n\n Ödenecek tutar: " + ucret + " TL");


    }


}



