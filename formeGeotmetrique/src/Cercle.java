public class Cercle extends Forme{
     private double rayon;
public Cercle(){
    super();
}

public Cercle(double rayon){
    super();
    this.rayon = rayon;
}

public Cercle(double rayon,String couleur,boolean remplissage){
    super();
    this.rayon = rayon;
    getCouleur();
    estRempli();
}

public double getRayon(){
    return rayon;
}

public double setRayon(double newRayon){
    rayon = newRayon;
    return newRayon;
}
@Override
double surface() {
    double area;
    area = 3.14*rayon;
    return area;
    } //surface d'un cercle

@Override
double perimetre() {
    double p;
    p = (2*3.14)*rayon;
    return p;
    }

    @Override
    public String toString() {
        return "Cercle \n" +
                "couleur: " + getCouleur()+
                " rayon= " + rayon +
                " circon= "+ perimetre()+
                " surface = "+surface();
    }
    //circumference of a cercle
}
