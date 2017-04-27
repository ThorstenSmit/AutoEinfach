package gitauto;

public class Autoreifen implements Ersatzteile {
    private double preis;
    private String groesse;
    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }
    public String getGroesse(String groesse) {
        return this.groesse;
    }
    @Override
    public void setPreis(double preis) {
        this.preis = preis;
    }
    @Override
    public double getPreis() {
        return this.preis;
    }
}
