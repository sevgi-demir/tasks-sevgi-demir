/**
 * @author sevgidemir
 */
public class Hatchback extends Araclar {
    private static double GunlukKiralamaUcreti;
    public Hatchback(String aracTipi, int bagajKapasitesi, String renk) {
        super(aracTipi, bagajKapasitesi, renk);
        Hatchback.GunlukKiralamaUcreti = 200;
    }
    public static double getGunlukKiralamaUcreti() {
        return GunlukKiralamaUcreti;
    }
    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        GunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

}




