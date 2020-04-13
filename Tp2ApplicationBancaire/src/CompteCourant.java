class CompteCourant extends Compte {

    public CompteCourant(long accNumber, Client client) {
        super(accNumber, client);
    }
    public float getMontantTransfer(float cash){
        if (cash > 0 ){
            solde = solde-cash;
        }
        else{
            System.out.println("Please request a correct amount");
        }
        return solde;
    }

    public String toString(){
        return "Compte Courrant no: "+ this.getAccNumber() + " -- Solde: " + this.getSolde();
    }
}
