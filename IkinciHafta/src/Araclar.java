/**
 * @author sevgidemir
 */

public abstract class Araclar {
    private static String aracTipi;
    private static int bagajKapasitesi;
    private static String renk;

    public Araclar(String aracTipi, int bagajKapasitesi, String renk) {
        Araclar.aracTipi = aracTipi;
        Araclar.bagajKapasitesi = bagajKapasitesi;
        Araclar.renk = renk;
    }

    //Private değişkenlere dışarıdan erişebilmek için her bir değişkenin get ve set mototları
    public static String getAracTipi() {
        return aracTipi;
    }
    public void setAracTipi(String aracTipi) {
        Araclar.aracTipi = aracTipi;
    }
    public static int getBagajKapasitesi() {
        return bagajKapasitesi;
    }
    public void setBagajKapasitesi(int bagajKapasitesi) {
        Araclar.bagajKapasitesi = bagajKapasitesi;
    }
    public static String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        Araclar.renk = renk;
    }

    static void kontrol1() {
        System.out.println("Şirket hesabıyla giriş yaptığınız için bütün araçları görebilirsiniz:");
        System.out.println("Araç tipi: " + SUV.getAracTipi() +  "\nRengi: " + SUV.getRenk() + "\nBagaj kapasitesi: " + SUV.getBagajKapasitesi()  + "\nGünlük kiralama ücreti: " + SUV.getGunlukKiralamaUcreti() + " TL" + "\nAylık kiralama ücreti: " + SUV.getAylikKiralamaUcreti() + " TL" );
        System.out.println("=============================");
        System.out.println("Araç tipi: " + Sedan.getAracTipi() +  "\nRengi: " + Sedan.getRenk() + "\nBagaj kapasitesi: " + Sedan.getBagajKapasitesi()  + "\nGünlük kiralama ücreti: " + Sedan.getGunlukKiralamaUcreti() + " TL" + "\nAylık kiralama ücreti: " + Sedan.getAylikKiralamaUcreti() + " TL" );
        System.out.println("=============================");
        System.out.println("Araç tipi: " + Hatchback.getAracTipi() +  "\nRengi: " + Hatchback.getRenk() + "\nBagaj kapasitesi: " + Hatchback.getBagajKapasitesi()  + "\nGünlük kiralama ücreti: " + Hatchback.getGunlukKiralamaUcreti() + " TL"  );
    }
    static void kontrol2() {
        System.out.println("Kişisel hesabınızla giriş yaptığınız için sadece hathback araçları görebilirsiniz:");
        System.out.println("Araç tipi: " + Hatchback.getAracTipi() +  "\nRengi: " + Hatchback.getRenk() + "\nBagaj kapasitesi: " + Hatchback.getBagajKapasitesi()  + "\nGünlük kiralama ücreti: " + Hatchback.getGunlukKiralamaUcreti() + " TL"  );
    }
}



