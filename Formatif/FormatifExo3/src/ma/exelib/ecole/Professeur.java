package ma.exelib.ecole;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Professeur(int id,String nom, String prenom,String telephone,String email){
        this.id = id++;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }


    protected String getNom() {
        return nom;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected int getId() {
        return id;
    }

    protected String getEmail() {
        return email;
    }

    protected String getTelephone() {
        return telephone;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
