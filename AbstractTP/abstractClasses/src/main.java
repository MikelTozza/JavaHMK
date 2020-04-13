import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

public class main {
    public static void main(String[] args) {
        Developpeur dev1 = new Developpeur("Java",1,"Tozza","Mikel","mail@mail.com","514-451-4325",35000.00);
        Manager mana1 = new Manager("Public Relations",1,"Abdul","Mohammed","mailMan@mail.com","514-920-5832",30000.00);
        Developpeur dev2 = new Developpeur("PHP",2, "BlahBlah","BlehBleh","Mail@gmafiodfn.com","514938933",100000.0);
        dev1.afficher();
        dev2.afficher(); // fix so that we can have individual Incomes
        mana1.afficher();
    }
}
