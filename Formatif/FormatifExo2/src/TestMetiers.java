public class TestMetiers {

    public static void main(String[] args) {
        Personne[] personnes = new Personne[3];
        personnes[0] = new Enseignant("Jonathan","enseignant");
        personnes[1] = new Etudiant("Simon","etudiant");
        personnes[2]= new Administrateur("Eric","administrateur");

        for(int i=0; i <personnes.length;i++){
            personnes[i].afficher();
        }
    }
}
