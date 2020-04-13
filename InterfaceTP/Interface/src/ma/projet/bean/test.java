package ma.projet.bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class test {
    public static void main(String[] args) {

        Personne directeur = new Personne(82816,"Directeur",001,"Tezaki","Shin", LocalDate.of(1978, Month.JANUARY,11),175000.00);
        Personne employer = new Personne(21023,"Employer",002,"Tozza","Mikel",LocalDate.of(1995, Month.AUGUST,8),50000.00);

        employer.affiche();
        directeur.affiche();

        employer.calculerSalaire();
        directeur.calculerSalaire();

        employer.affiche();
        directeur.affiche();
    }
}
