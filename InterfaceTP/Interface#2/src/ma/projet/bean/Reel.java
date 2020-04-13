package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Reel implements IOperation, IAffichage {
    double x;

    public Reel(double x){
        this.x = x;
    }

    public Object plus(double x){
        return x;
    }

    public Object moin(double x){
        return x;
    }

    @Override
    public String affiche() {
        return "The reel number is: " + this.x;
    }

    @Override
    public Object plus(Object obj) {
        return null;
    }

    @Override
    public Object moins(Object obj) {
        return null;
    }
}
