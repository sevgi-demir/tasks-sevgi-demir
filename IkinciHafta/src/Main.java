/**
 * @author sevgidemir
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Araçların özellikleri
        SUV suv = new SUV("SUV", 300, "mavi");
        Sedan sedan = new Sedan("Sedan", 500, "lacivert");
        Hatchback hatchback = new Hatchback("Hatchback", 250, "beyaz");

        //Mail adresinin bir kişisel hesap mı yoksa şirket hesabı mı olduğunun kontrolü
        boolean mail_kontrol=true;
        while (mail_kontrol) {
            Scanner input = new Scanner(System.in);
            System.out.print("Mail adresi giriniz:");
            String mail = input.nextLine();
            try
            {
                String[] str = mail.split("@");
                if (str[1].equals("patika.dev") || str[1].equals("kodluyoruz.org")) {
                    Araclar.kontrol1();
                    mail_kontrol=false;
                } else if (str[1].equals("gmail.com")) {
                    Araclar.kontrol2();
                    mail_kontrol=false;
                } else {
                    System.out.println("Geçersiz mail adresi tekrar deneyiniz!\n");
                }
            }
            catch(Exception e) { }
        }
    }
}








