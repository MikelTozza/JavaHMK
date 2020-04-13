import java.time.LocalDate;

public class Contract {
    public int numeroContrat;
    public LocalDate dateContrat;
    public String adresseLieu;
    public int numeroCompteur;
    public int oldIndex;
    public int newIndex;
    public String puissance;
    public Double tarif;


    public Contract(int numeroContrat, LocalDate dateContrat, String adresseLieu,int numeroCompteur,int oldIndex, int newIndex,String puissance, Double tarif,Client client) {
        this.numeroContrat= numeroContrat;
        this.dateContrat= dateContrat;
        this.adresseLieu= adresseLieu;
        this.numeroCompteur = numeroCompteur;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.puissance = puissance;
        this.tarif = tarif;
    }


    public int getNumeroContrat() {
        return numeroContrat;
    }
    public void setNumeroContrat(int numeroContrat) {
        this.numeroContrat = numeroContrat;
    }

    public LocalDate getDateContrat() {
        return dateContrat;
    }
    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    public String getAdresseLieu() {
        return adresseLieu;
    }
    public void setAdresseLieu(String adresseLieu) {
        this.adresseLieu = adresseLieu;
    }

    public int getNumeroCompteur() {
        return numeroCompteur;
    }
    public void setNumeroCompteur(int numeroCompteur) {
        this.numeroCompteur = numeroCompteur;
    }

    public int getOldIndex() {
        return oldIndex;
    }
    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }
    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public String getPuissance() {
        return puissance;
    }
    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public Double getTarif() {
        return tarif;
    }
    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numeroContrat=" + this.numeroContrat +
                ", dateContrat=" + this.dateContrat +
                ", adresseLieu='" + this.adresseLieu + '\'' +
                ", numeroCompteur=" + this.numeroCompteur +
                ", oldIndex=" + this.oldIndex +
                ", newIndex=" + this.newIndex +
                ", puissance='" + this.puissance + '\'' +
                ", tarif=" + this.tarif +
                '}';
    }
}
