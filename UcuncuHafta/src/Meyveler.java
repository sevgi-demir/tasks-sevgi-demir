/**
 * @author sevgidemir
 */
/*public abstract class Meyveler {
    public static String meyveAdi;
    public static int kg;
    public static int kgFiyati;

    public void manavBilgi() {
        System.out.println("Mallar dükkana gelmiştir.");
    }

    public void MeyveAdi() {
        this.meyveAdi=meyveAdi;

    }

    /*public static String getMeyveAdi() {
        return meyveAdi;
    }

    public void setMeyveAdi(String meyveAdi) {
        this.meyveAdi = meyveAdi;
    }

    public static int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public static int getKgFiyati() {
        return kgFiyati;
    }

    public void setKgFiyati(int fiyat) {
        this.kgFiyati = fiyat;
    }





}*/

/**
 * @author sevgidemir
 */
public class Meyveler {

    public static String meyveAdi;
    public static int kg;
    public static int kgFiyati;

    public Meyveler(String meyveAdi, int kg, int kgFiyati) {
        this.meyveAdi=meyveAdi;
        this.kg=kg;
        this.kgFiyati=kgFiyati;
    }

    public void manavBilgi() {
        System.out.println("Mallar dükkana gelmiştir.");
    }
    public String MeyveAdi() {
        return "meyve";
    }
    public int Kg() {
        return 0;
    }
    public int KgFiyati() {
        return 0;
    }

}



