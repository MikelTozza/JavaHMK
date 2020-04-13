public class main {
    public static void main(String[] args) {
        Vehicule car1 = new Vehicule(true,200);
        Voiture_Composee car2 = new Voiture_Composee(true,150,2,car1);
        Voiture_Derivee car3 = new Voiture_Derivee(true,350,3);

        System.out.println(car1.getVitesseMax());
        System.out.println(car2.getVitesseMax());
        System.out.println(car3.getVitesseMax());

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
         //honetement je sais pas c'est quoi qu'il faut avoir comme resultat final

    }
}
