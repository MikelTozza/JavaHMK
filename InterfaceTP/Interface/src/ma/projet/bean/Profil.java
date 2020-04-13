package ma.projet.bean;

public class Profil {
    private int id;
    private int code;
    private String libelle;

    public Profil(int id, int code, String libelle){
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
