package ma.projet.bean;

public class test {
    public static void main(String[] args) {
        Complexe Cnumber = new Complexe(10,5); // so 5i
        Reel Rnumber = new Reel(10); // so 10

        Cnumber.affiche();
        Rnumber.affiche();
    }
}
