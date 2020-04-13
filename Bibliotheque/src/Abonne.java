import java.util.Collection;
import java.util.Date;

public class Abonne extends Ouvrage{
    int id;
    String nom;
    String prenom;

    public Abonne(int id, String nom, String prenom){
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    }

    public Date emprunte(BandeDessinee bandeDessinee, Date date) {
        Date dateEmprunt = new Date();//the java date, not the class

        return dateEmprunt;
    }
    public Date emprunte(Livre livre, Date date) {
        Date dateEmprunt = new Date();//the java date, not the class

        return dateEmprunt;
    }

}
