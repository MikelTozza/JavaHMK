import java.util.Date;

public class Livre extends Ouvrage{
    String titre;
    String auteur;

    public Livre(String titre,String auteur){
        super();
        this.titre = titre;
        this.auteur =auteur;
    }
    public Date emprunte(Livre livre, Date date) {
        Date dateEmprunt = new Date();//the java date, not the class
        return dateEmprunt;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

}
