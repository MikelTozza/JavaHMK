public class Rectangle extends Forme {
    private double largeur;
    double longeur;

public Rectangle(){ // empty but with Forme properties
    super();
}

public Rectangle(double largeur, double longeur){ // rectangle properties
    this.largeur= largeur;
    this.longeur = longeur;
}

public Rectangle(double largeur, double longeur,boolean remplissage,String couleur){ //forme and rectangle properties
    this.largeur= largeur;
    this.longeur = longeur;
    getCouleur();
    estRempli();
}

public double getLongeur() { // get longeur of rectangle
    return longeur;
}

public double setLongeur(double newLongeur){ // set longeur of rectangle
    longeur = newLongeur;
    return newLongeur;
}

public double getLargeur(){ // get largeur of rect
    return largeur;
}

public double setLargeur(double newLargeur){ // set largeur of rect
    largeur =newLargeur;
    return newLargeur;
}

    @Override
    double surface() {
    double area;
    area = largeur*largeur;
        return area;
    }

    @Override
    double perimetre() {
        double p;
        p = 2*(longeur+largeur);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle \n" +
                "couleur= " + getCouleur()+
                " largeur= " + this.largeur +
                " longeur= " + this.longeur +
                " perimetre= " + perimetre() +
                " surface= " + surface();

    }
}
