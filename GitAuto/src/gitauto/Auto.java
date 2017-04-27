package gitauto;
import java.util.ArrayList;

public class Auto extends Fahrzeug {
    private int pferdestaerke;
    private int pos;
    //Es gibt zwei Varianten diese Aggregation zu realisieren
    private Autoreifen[] autoreifenArrayVarianteA = new Autoreifen[4];
    private ArrayList<Autoreifen> autoreifenArrayVarianteB = new ArrayList();
    
    public Auto(Autoreifen[] autoreifenArrayFuerVarianteA) {
        this.autoreifenArrayVarianteA = autoreifenArrayFuerVarianteA;
    }
    public Auto(ArrayList<Autoreifen> autoreifenArrayFuerVarianteB) {
        if (autoreifenArrayFuerVarianteB.size() == 4) {
            for (int i = 0; i < autoreifenArrayFuerVarianteB.size(); i++) {
                this.autoreifenArrayVarianteB.add(autoreifenArrayFuerVarianteB.get(i));
            }
        } else {
            System.out.println("Es liegt ein Fehler vor!");
        }
    }
    
    public void setPferdestaerke(int ps){
        this.pferdestaerke=ps;
    }
    
    public int getPferdestaerke(){
        return this.pferdestaerke;
    }

    @Override
    void fortbewegen() {
        this.pos+=2;
    }
    
    public int getPos(){
        return this.pos;
    }
    
    public double getGesamtpreisReifen(){
        double gesamtpreis=0;
        for(Autoreifen reifen : this.autoreifenArrayVarianteA){
            gesamtpreis+=reifen.getPreis();
        }
        return gesamtpreis;
    }
    
}
