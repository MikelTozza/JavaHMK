public class Compte{
    long accNumber;
    float solde;
    Client client;

    public Compte(long accNumber, Client client){
        this.accNumber = accNumber;
        this.client = client;
    }
    public float getSolde(){
        return solde;
    }
    public long getAccNumber(){
        return accNumber;
    }
    public float credit(float cash){
        solde = solde + cash;
        return solde;
    }
    public String toString(){
        return "Account number: "+ this.getAccNumber() + " -- Client: "+ client.getNom() + " -- Solde: " + this.getSolde();
    }
}
