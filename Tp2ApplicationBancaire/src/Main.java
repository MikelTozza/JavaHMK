import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<Client>();
        ArrayList<Compte> accountList = new ArrayList<Compte>();
        for (int i = 0; i < 4; i++) {
            Client myClient = new Client(0+i, "c"+i);
            clientList.add(myClient);
            for (int j = 0; j < 4; j++) {
                accountList.add(new Compte(j,myClient));
                accountList.add(new CompteCourant(j,myClient));
                accountList.add(new CompteEpargne(j,myClient));
            }
        }
        System.out.println(clientList);
        System.out.println(accountList);





        //CompteCourant comCou1 = new CompteCourant(1001,c1);
        //CompteEpargne comEpa1 = new CompteEpargne(1002,c1);
//        CompteCourant comCou2 = new CompteCourant(2001,c2);
//        CompteEpargne comEpa2 = new CompteEpargne(2002,c2);
//        CompteCourant comCou3 = new CompteCourant(3001,c3);
//        CompteEpargne comEpa3 = new CompteEpargne(3002,c3);
//        CompteCourant comCou4 = new CompteCourant(4001,c4);
//        CompteEpargne comEpa4 = new CompteEpargne(4002,c4);

//        c1.addCompte(comCou1); // add account
//        c1.addCompte(comEpa1);;
//
//        comCou1.credit(1000); // add cash
//        comEpa1.credit(20000); // add cash
//        System.out.println(c1);
//
//        comEpa1.transfer(comCou1,comEpa1,500); // transfer 500 from comCou1 to comEpa1
//        System.out.println(c1);

    }

}

