/**
 * @author sevgidemir
 */
public class SUV extends Araclar {
    private static double GunlukKiralamaUcreti;
    private static double AylikKiralamaUcreti;
    private int aracYasi = 10;
    public SUV(String aracTipi, int bagajKapasitesi, String renk) {
        super(aracTipi, bagajKapasitesi, renk);   //üst sınıfın ögelerine ulaşmak için super() metodunu kullandık

        SUV.GunlukKiralamaUcreti = Math.round(200+(1/(4+(double)aracYasi)*400));
        SUV.AylikKiralamaUcreti= Math.round(200+(1/(4+(double)aracYasi)*400)*30);
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





