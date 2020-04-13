package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Complexe implements IOperation, IAffichage {
    double im;
    double re;

    public Complexe(double im,double re){
        this.im = im;
        this.re = re;
    }

    @Override
    public String affiche() {
        return null;
    }

    @Override
    public Object plus(Object obj) {
        Complexe tmp = new Complexe(0,0);
        return null;
    }

    @Override
    public Object moins(Object obj) {
        return null;
    }
}

