/**
 * @author sevgidemir
 */
/*public class Armut extends Meyveler{

    @Override
    public void manavBilgi() {
        System.out.println("Armutlar dükkana gelmiştir.");
    }

    public static String getMeyveAdi() {
        return "Armut";
    }

    public static int getKg() {
        return 30;
    }

    public static int getKgFiyati() {
        return 6;
    }

    }*/

/**
 * @author sevgidemir
 */
public class Armut extends Meyveler{

    public Armut() {
        super(meyveAdi, kg, kgFiyati);
    }

    @Override
    public void manavBilgi() {
        System.out.println("Armutlar dükkana gelmiştir.");
    }

    @Override
    public String MeyveAdi() {
            return meyveAdi="Armut";
    }

    @Override
    public int Kg() {
        return kg=30;
    }

    @Override
    public int KgFiyati() {
        return kgFiyati=6;
    }
}



