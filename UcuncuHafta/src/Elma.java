/**
 * @author sevgidemir
 */
/*public class Elma extends Meyveler {




    @Override
    public void manavBilgi() {
        System.out.println("Elmalar dükkana gelmiştir.");
    }
    @Override
    public void MeyveAdi() {
        this.meyveAdi="elma";

    }

    public static String getMeyveAdi() {
        return "Elma";
    }


    public static int getKg() {
        return 20;
    }

    public static int getKgFiyati() {
        return 5;
    }





    }*/

/**
 * @author sevgidemir
 */
public class Elma extends Meyveler {

    public Elma() {
        super(meyveAdi,kg,kgFiyati);
    }

    @Override
    public void manavBilgi() {
        System.out.println("Elmalar dükkana gelmiştir.");
    }

    @Override
    public String MeyveAdi() {
       return meyveAdi="Elma";
    }

    @Override
    public int Kg() {
        return kg=20;
    }

    @Override
    public int KgFiyati() {
        return kgFiyati=5;
    }










    }

















