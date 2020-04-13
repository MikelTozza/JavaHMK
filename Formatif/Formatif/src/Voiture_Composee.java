public class Voiture_Composee extends Vehicule{
    private Vehicule ve;
    private int nombreDePortes;

    public Voiture_Composee(boolean moteur, int vitesseMax,int nombreDePortes,Vehicule ve) {
        super(moteur, vitesseMax);
        this.nombreDePortes = nombreDePortes;
        this.ve = ve;
    }


    @Override
    public String toString() {
        return "Voiture_Composee{" +
                "ve=" + this.ve +
                ", nombreDePortes=" + this.nombreDePortes +
                '}';
    }
}
