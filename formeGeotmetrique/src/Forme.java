abstract public class Forme {
    private String couleur;
    private boolean remplissage;

public Forme(){
    this.couleur = couleur;
    this.remplissage = remplissage;
}

public String getCouleur(){ //getter
    return this.couleur;
}

public String setCouleur(String newCouleur){//setter
    this.couleur = newCouleur;
    return newCouleur;
}

public boolean estRempli(){//getter
    return this.remplissage;
}

public boolean setRempli(boolean newRemplissage){//setter
    this.remplissage =newRemplissage;
    return newRemplissage;
}

abstract double surface();
abstract double perimetre();

    @Override
    public String toString() {
        return "Forme= " +
                "couleur= '" + this.couleur + '\'' +
                ", remplissage= " + this.remplissage +
                '}';
    }
}
