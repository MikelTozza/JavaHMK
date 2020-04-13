import java.util.Date;

public class BandeDessinee extends Ouvrage{
    String titre;
    String auteur;
    String dessinateur;

    public BandeDessinee(String titre,String auteur, String dessinateur){
        super();
        this.titre =titre;
        this.auteur = auteur;
        this.dessinateur = dessinateur;
    }


    @Override
    public String toString() {
        return "BandeDessinee{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", dessinateur='" + dessinateur + '\'' +
                ", date emprunt= " +
                '}';
    }

}
