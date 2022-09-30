/**
 * @author sevgidemir
 */
public class Sedan extends Araclar {
    private static double GunlukKiralamaUcreti;
    private static double AylikKiralamaUcreti;
    public Sedan(String aracTipi, int bagajKapasitesi, String renk) {
        super(aracTipi, bagajKapasitesi, renk);
        Sedan.GunlukKiralamaUcreti = 300;
        Sedan.AylikKiralamaUcreti= GunlukKiralamaUcreti*30;
    }
    public static double getGunlukKiralamaUcreti() {
        return GunlukKiralamaUcreti;
    }
    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        GunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }
    public static double getAylikKiralamaUcreti() {
        return AylikKiralamaUcreti;
    }
    public void setAylikKiralamaUcreti(double aylikKiralamaUcreti) {
        AylikKiralamaUcreti = aylikKiralamaUcreti;
    }
}




