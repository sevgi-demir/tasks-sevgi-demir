/**
 * @author sevgidemir
 */
/*public class Kiraz extends Meyveler{

    @Override
    public void manavBilgi() {
        System.out.println("Kirazlar dükkana gelmiştir.");
    }
    public static String getMeyveAdi() {
        return "Kiraz";
    }


    public static int getKg() {
        return 40;
    }

    public static int getKgFiyati() {
        return 10;
    }
}*/
/**
 * @author sevgidemir
 */
public class Kiraz extends Meyveler{

    public Kiraz() {
        super(meyveAdi, kg, kgFiyati);
    }

    @Override
    public void manavBilgi() {
        System.out.println("Kirazlar dükkana gelmiştir.");
    }

    @Override
    public String MeyveAdi() {
        return meyveAdi="Kiraz";
    }

    @Override
    public int Kg() {
        return kg=40;
    }

    @Override
    public int KgFiyati() {
        return kgFiyati=10;
    }
}

