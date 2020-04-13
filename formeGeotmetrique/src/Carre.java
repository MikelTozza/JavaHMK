public class Carre extends Rectangle {
    private double cote;
    public Carre(){
        super();
    }

    public Carre(double cote){
        this.cote = cote;
    }

    public Carre(double cote,boolean remplissage, String couleur){
        this.cote = cote;
        getCouleur();
        estRempli();
    }

    public double getCote(){
        return cote;
    }

    public double setCote(double c){
        cote = c;
        return c;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
