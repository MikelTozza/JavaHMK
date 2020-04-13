import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(10.0);
        Rectangle r1 = new Rectangle(10,15);
        Carre s1 = new Carre(5);
        c1.setCouleur("red");
        r1.setCouleur("yellow");
        s1.setCouleur("orange");

        ArrayList<Forme> RANDOMFORME = new ArrayList<Forme>();
        RANDOMFORME.add(c1);
        RANDOMFORME.add(r1);
        RANDOMFORME.add(s1);
        System.out.println(RANDOMFORME);




    }
}
