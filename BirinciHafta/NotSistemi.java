package BirinciHafta;

/**
 * Okul puanlarının harf karşılığını yazan program.
 * Random alınabilir değerler.
 * 0 - 35 arası FF
 * 35 - 50 arası DC
 * 50 - 70 arası BB
 * 70 - 100 arası AA
 */


import java.util.Random;

public class NotSistemi {
    public static void main(String[] args) {
            Random r=new Random();
            int not=r.nextInt(100);

            if(not>=0 && not<=35) {
                System.out.println("not:" + not + " Puanın harf karşılığı:FF");
            } else if(not>35 && not<=50) {
                System.out.println("not:" + not + " Puanın harf karşılığı:DC");
            } else if(not>50 && not<=70) {
                System.out.println("not:" + not + " Puanın harf karşılığı:BB");
            } else if(not>70 && not<=100) {
                System.out.println("not:" + not + " Puanın harf karşılığı:AA");
            }


    }}




