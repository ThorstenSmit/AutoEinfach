package gitauto;

public abstract class Fahrzeug {
    
    private String farbe;
    private String hersteller;
    
    public void setFarbe(String farbe){
        this.farbe=farbe;
    }
    public String getFarbe(){
        return this.farbe;
    }
    
    public void setHersteller(String hersteller){
        this.hersteller=hersteller;
    }
    
    public String getHersteller(){
        return this.hersteller;
    }
    
    abstract void fortbewegen();
    
}
