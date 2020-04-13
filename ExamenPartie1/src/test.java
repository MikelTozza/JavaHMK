import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<Client> clienList = new ArrayList<>();
        ArrayList<Contract> contractList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            //TEST DE CLIENT NORMAL SANS D OU ND
            Client myClient = new Client(0+i,"Tozza", "Mikel", LocalDate.of(2019, Month.AUGUST,11),"4325 forest","514-451-4325","mikey@gmail.com");
            Domestique clientDom = new Domestique(0+i,"boo", "toto", LocalDate.of(2019, Month.AUGUST,11),"4325 forest","514-451-4325","mikey@gmail.com","D");
            NonDomestique clientNDom = new NonDomestique(0+i,"bye", "oofof", LocalDate.of(2019, Month.AUGUST,11),"4325 forest","514-451-4325","mikey@gmail.com","ND");
            clienList.add(myClient);
            clienList.add(clientDom);
            clienList.add(clientNDom);
            for (int j = 0; j < 4; j++) {
                contractList.add(new Contract(1000 + j, LocalDate.of(2019, Month.DECEMBER, 20 + j), "Second work place", 1001 + j, 200, 777, "70kw", 2000.0, myClient));
            }
        }
        System.out.println(clienList.toString());
        System.out.println(contractList.toString());
        contractList.toString();

        // CONSOMMATION DANS LE FICHIER CLIENT

    }
}
