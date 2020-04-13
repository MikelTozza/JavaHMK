import java.util.ArrayList;

public class Client {
long numero;
String nom;
Compte compte;
ArrayList<Client> clientList = new ArrayList<Client>();
ArrayList<Compte> accountList = new ArrayList<Compte>();


public Client(long numero, String nom){ // makes objects
this.numero =  numero;
this.nom = nom;
clientList = new ArrayList<Client>();
accountList = new ArrayList<Compte>();
}

public long getNumero(){
return numero;
}

public String getNom(){
return nom;
}

public void setNom(String nom){
this.nom = nom;
}

public void addCompte(Compte compte){
accountList.add(compte);
}

public void EmptyList(){
    accountList.clear();
}

public String toString(){
    if (accountList.isEmpty()){
        System.out.println("There is no account");
    }
    else
    {
        System.out.println(accountList.toString());
    }
return ("Client Number: "+ this.getNumero() + " -- Client Name: "+ this.getNom());

}


}

