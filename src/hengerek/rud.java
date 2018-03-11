package hengerek;

/**
 *
 * @author Sándor
 */
public class rud extends henger {
    public double fajsuly;

    public rud(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }
    
    public double suly() {
      return terfogat()*fajsuly;
    }
    
    @Override
    public String toString() {
        System.out.println("fajsuly\t"+fajsuly);
        System.out.println("suly\t"+suly());
        return null;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public double getSugar() {
        return sugar;
    }

    @Override
    public double getMagassag() {
        return magassag;
    }
    
    
}
