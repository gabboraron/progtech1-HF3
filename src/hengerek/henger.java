package hengerek;

import java.lang.Math.*;

/**
 *
 * @author Sándor
 */
public class henger {
    public double sugar;
    public double magassag;
    
    public henger(cso tmpcso){
        this.sugar = tmpcso.getSugar();
        this.magassag = tmpcso.getMagassag();
    }
    
    public henger(rud tmprud){
        this.sugar = tmprud.getSugar();
        this.magassag = tmprud.getMagassag();
    }    
    
    public henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }
    
    public double terfogat() {
      return sugar*sugar*Math.PI*magassag;
    }
}
