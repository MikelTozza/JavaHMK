public class CompteEpargne extends CompteCourant {
    public CompteEpargne(long accNumber, Client client) {
        super(accNumber, client);
    }

    public static void transfer (CompteCourant from, CompteEpargne to, float amount) //fonction transfer de n'importe quelle compte
    {
        from.getMontantTransfer(amount); // prend le mountant de la fonction getMontantTransfer
        to.credit(amount); // credit le compte epargne
    }

    public float getMontantTransfer(float amount){ //withdraw
    if (amount > 0 ){
        solde = solde-amount;
    }
    else{
        System.out.println("Please request a correct amount");
    }
    return solde;
    }

    public String toString(){
        return "Compte Epargne no: "+ this.getAccNumber() + " -- Solde: " + this.getSolde();
    }
}
