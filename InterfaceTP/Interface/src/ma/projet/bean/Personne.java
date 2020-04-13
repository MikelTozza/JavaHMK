package ma.projet.bean;

import ma.projet.inter.IPersonne;

import java.time.LocalDate;

public class Personne extends Profil implements IPersonne {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate datenais;
    private Double salaire;

    public Personne(int code, String libelle,int id, String nom, String prenom, LocalDate datenais, Double salaire){
        super(id, code, libelle);
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.datenais = datenais;
        this.salaire = salaire;
    }


    @Override
    public void affiche() {
        System.out.println("Je suis le "+getLibelle() +" "+this.prenom+" "+this.nom+" ne le "+this.datenais+" mon salaire est "+this.salaire);
    }

    @Override
    public double calculerSalaire() {
        if (getLibelle() =="Directeur"){
            salaire = salaire+(salaire*0.20);
        }
        else{
            salaire = salaire+(salaire*0.10);
        }
        return 0;
    }
}
