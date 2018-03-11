package hengerek;

import java.util.Vector;

/**
 *
 * @author Sándor
 */
public class Hengerek {
    public static void main(String[] args) {
        //hozzunk létre néhány rudat és csövet
        rud rud1 = new rud(1.1,2.2,3.0);    //fajsuly:3.0  suly:25.0 
        rud rud2 = new rud(2,3,4);          //fajsuly:4.0  suly:150.79 
        
        cso cso1 = new cso(2,3,4,1);        //fal: 1       csterfogat:28.27
        cso cso2 = new cso(3,4,5,1.5);      //fal: 1.5     csterfogat:84.82 
        
        //bemenet kilistázása
        System.out.println("RUDAK:");        
        rud1.toString();
        rud2.toString();
        
        System.out.println("CSOVEK:");
        cso1.toString();
        cso2.toString();
        
        //csovek/rudak egy henger vektorban
        Vector<henger> hengerek = new Vector();
        hengerek.add(cso1);
        hengerek.add(cso2);
        hengerek.add(rud1);
        hengerek.add(rud2);
        
        System.out.println("\nFELADATOK:");
        
        System.out.print("Számítsuk ki a vektorban lévő hengerek átlag térfogatát!\t");
        System.out.println(osszTerfogat(hengerek));
        System.out.print("Listázzuk ki csak a csöveket, és adjuk meg az összsúlyukat!\t");
        System.out.println(osszCsoSuly(hengerek));
        System.out.println("Listázzuk ki csak a rudakat és adjuk meg a számukat!\t");
        System.out.println(rudakKiListaz(hengerek));
        
    }

    private static double osszCsoSuly(Vector hengerek) {
        cso tmpCso = new cso(1,1,1,1);
        double osszSuly=0;
        for (int idx = 0; idx < hengerek.size(); idx++) {
            if(hengerek.elementAt(idx).getClass().equals(tmpCso.getClass())){
                cso tmpCsoSzamlalashoz = (cso) hengerek.elementAt(idx);
                osszSuly += tmpCsoSzamlalashoz.csoTerfogat();
            }
        }
        return osszSuly;
    }

    private static double osszTerfogat(Vector<henger> hengerek) {
        double osszTerfogatTmp = 0;
        
        for (int idx = 0; idx < hengerek.size(); idx++) {
            henger hengerAt = hengerek.elementAt(idx);
            osszTerfogatTmp += hengerAt.terfogat();
        }
        return osszTerfogatTmp/hengerek.size();
    }

    private static int rudakKiListaz(Vector<henger> hengerek) {
        int rudakszama = 0;
        rud tmpRud = new rud(1,1,1);
        
        System.out.println("\nSUGÁR\tMAGASSÁG\tFAJSÚLY\t\tSÚLY");
        for (int idx = 0; idx < hengerek.size(); idx++) {
            if(hengerek.elementAt(idx).getClass().equals(tmpRud.getClass())){
                rud tmpRudSzamlalashoz = (rud) hengerek.elementAt(idx);
                System.out.println( tmpRudSzamlalashoz.getSugar() + "\t" + tmpRudSzamlalashoz.getMagassag() + "\t\t" + tmpRudSzamlalashoz.getFajsuly()  + "\t\t" + tmpRudSzamlalashoz.suly() );
                ++rudakszama;
            }
        }
        System.out.println("------\t--------\t-------\t\t----");
        System.out.println("Összesen darabszám: ");
        return rudakszama;
    }
}
