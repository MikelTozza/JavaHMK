public class Vehicule {
    private boolean moteur;
    private int vitesseMax;

    public Vehicule(boolean moteur,int vitesseMax){
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseMax() { //get max speed
        return vitesseMax;
    }
    public int setVitesseMax(int vitesseMax){
        return vitesseMax;
    }

    public boolean getMoteur(boolean moteur){ //get moteur(idk why yet)
        return moteur;
    }

    public void vMax(){ //return max speed
        getVitesseMax();
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "moteur=" + moteur +
                ", vitesseMax=" + vitesseMax +
                '}';
    }
}
