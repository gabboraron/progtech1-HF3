package hengerek;

/**
 *
 * @author Sándor
 */
public class cso extends rud{
    public double falVastagsag;
    
    public cso(double sugar, double magassag, double fajsuly, double falVastagsag) {
        super(sugar, magassag, fajsuly);
        this.falVastagsag = falVastagsag;
    }
    
    public double csoTerfogat() {
      return terfogat() - ((sugar-falVastagsag)*(sugar-falVastagsag)*Math.PI*magassag);
    }
   
    @Override
    public String toString() {
        System.out.println("falVastagsag\t"+falVastagsag);
        System.out.println("csoTerfogat\t"+csoTerfogat());
        return null;
    }

    public double getFalVastagsag() {
        return falVastagsag;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    
}
