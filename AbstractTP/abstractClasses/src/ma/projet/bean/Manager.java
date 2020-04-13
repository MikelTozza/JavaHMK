package ma.projet.bean;
import ma.projet.Personne;

import java.util.Scanner;

public class Manager extends Personne {
    private  String service;

    public Manager(String service,int id, String nom, String prenom, String mail, String telephone, Double salaire){
        super();
        this.service = service;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public void afficher(){
        System.out.println("Le salaire du Manager "+ this.prenom+" est: "+this.calculerSalaire()+", son service: "+this.service);
    }
    public double calculerSalaire(){
        salaire = salaire+(salaire*0.35);
        return  salaire;
    }
}
