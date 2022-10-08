/**
 * @author sevgidemir
 */
public class HavaYoluSirketleri {
    public static String sirketAdi;
    public static double businessUcret;
    public static double ekonomiUcret;

    public HavaYoluSirketleri(String sirketAdi, double businessUcret, double ekonomiUcret) {
        this.sirketAdi=sirketAdi;
        this.businessUcret=businessUcret;
        this.ekonomiUcret=ekonomiUcret;
    }


    public String SirketAdi() {
        return "sirket";
    }
    public double BusinessUcret () {
        return 0;
    }
    public double EkonomiUcret () {
        return 0;
    }

}

