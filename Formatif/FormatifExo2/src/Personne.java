public class Personne {
    public String nom;
    public String role;

    public Personne(String nom, String role) { //j'ai rajouter role our mettre son titre dans le tostring
        this.nom = nom;
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void  afficher() {
        System.out.println( "je suis " + this.nom + " l'" + this.role);
    }
}
