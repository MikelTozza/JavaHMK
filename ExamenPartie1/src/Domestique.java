import java.time.LocalDate;

public class Domestique extends Client {
    public String typeOfClient;
    public Domestique(int numero, String nom, String prenom, LocalDate date, String adresse, String telephone, String email, String typeOfClient) {
        super(numero, nom, prenom, date, adresse, telephone, email);
        this.typeOfClient = typeOfClient;
    }
}
