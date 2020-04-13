import java.util.Date;

abstract public class Bibliotheque {
    public static void main(String[] args) {

        Abonne Mikel = new Abonne(1,"Tozza","Mikel"); //person
        BandeDessinee OnePiece = new BandeDessinee("One Piece","Eiichiro Oda","Hisada Kazuya"); // manga
        Livre Odyssey = new Livre("Odyssey","Homer"); // book



        Mikel.emprunte(OnePiece,new Ddate(20,8,2020));
        Mikel.emprunte(Odyssey,new Ddate(20,8,2020));


        System.out.println(Mikel.emprunte(OnePiece,new Ddate(20,8,2020)));
    }
}
