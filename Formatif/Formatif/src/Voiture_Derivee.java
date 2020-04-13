public class Voiture_Derivee extends Vehicule {
    private int nombreDePortes;


    public Voiture_Derivee(boolean moteur, int vitesseMax, int nombreDePortes) {
        super(moteur, vitesseMax);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public String toString() {
        return "Voiture_Derivee{" +
                "nombreDePortes=" + this.nombreDePortes +
                '}';
    }
}
