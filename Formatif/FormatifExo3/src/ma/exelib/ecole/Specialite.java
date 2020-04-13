package ma.exelib.ecole;

public class Specialite extends Professeur{
    private int id;
    private String code;
    private String libelle;

    public Specialite(int id, String nom, String prenom, String telephone, String email,String code,String libelle) {
        super(id, nom, prenom, telephone, email);
        this.id = id++;
        this.code = code;
        this.libelle = libelle;
    }


    protected int getId() {
        return id;
    }

    protected String getCode() {
        return code;
    }

    protected String getLibelle() {
        return libelle;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setCode(String code) {
        this.code = code;
    }

    protected void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", telephone='" + getTelephone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", code="+getCode()+
                ",libelle="+getLibelle()+
                '}';
    }
}
