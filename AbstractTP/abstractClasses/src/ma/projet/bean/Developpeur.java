package ma.projet.bean;
import ma.projet.Personne;
import java.util.Scanner;

public class Developpeur extends Personne {
    private String specialite;

    public Developpeur(String specialite,int id, String nom, String prenom, String mail, String telephone, Double salaire){
        super();
        this.specialite = specialite;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }


    public void afficher(){
        System.out.println("Le salaire du Developpeur "+ this.prenom+" est: "+this.calculerSalaire()+", son service: "+this.specialite);
    }
    public double calculerSalaire(){
        salaire = salaire+(salaire*0.20);
        return  salaire;
    }
}
