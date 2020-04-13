import java.time.LocalDate;
import java.util.ArrayList;

public class Client{
     public int numero;
     public String nom;
     public String prenom;
     public LocalDate date;
     public String adresse;
     public String telephone;
     public String email;
     Contract contract;
     ArrayList<Client> clienList = new ArrayList<>();
     ArrayList<Contract> contractList = new ArrayList<>();


    public Client(int numero, String nom, String prenom, LocalDate date, String adresse, String telephone, String email) {
        this.numero=numero++;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adresse = adresse;
        this.telephone =telephone;
        this.email = email;
        clienList = new ArrayList<>();
        contractList = new ArrayList<>();
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String consommation() { // fonction final, mais je n'ai pas pu la finir

        if(contractList.get(1) == null) { // si le arraylist retourne 1, donc aucun contrat relier
            return "no contract";
        }
        else if(contractList.get(2) == null) { //
            return "Client number : " + numero + "\n Contract number: " + contractList.get(1).getNumeroContrat() +
                    "\n A Consommer : " + (contractList.get(1).getOldIndex() - contractList.get(1).getNewIndex()) + contract.getPuissance();
        }
        else if(contractList.get(3) == null) {
            return "Client number : " + numero + "\n  Contract number: " + contractList.get(1).getNumeroContrat() +
                    "\n consom; : " + (contractList.get(1).getNewIndex() - contractList.get(1).getOldIndex()) + contract.getPuissance() +
                    "Contract number: " + contractList.get(2).getNumeroContrat() +
                    "\n consom; : " + (contractList.get(2).getNewIndex() - contractList.get(2).getOldIndex()) + contract.getPuissance() +
                    " total:  " + ((contractList.get(1).getNewIndex() - contractList.get(1).getOldIndex()) +
                    (contractList.get(2).getNewIndex() - contractList.get(2).getOldIndex())) + contract.getPuissance();
        }

        return "";
    }

    @Override
    public String toString() {
        return "Client{" +
                "numero=" + this.numero +
                ", nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom + '\'' +
                ", date=" + this.date +
                ", adresse='" + this.adresse + '\'' +
                ", telephone='" + this.telephone + '\'' +
                ", email='" + this.email + '\'' +
                ", typeOfClient='" + '\'' +
                '}';

    }
}