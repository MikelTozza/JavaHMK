package ma.exelib.ecole.test;
import ma.exelib.ecole.Professeur;
import ma.exelib.ecole.Specialite;

public class test {
    public static void main(String[] args) {
        Specialite prof1 = new Specialite(1,"Roy","Sylvain","514-928-2321","SilvainRoy@gmail.com","JAVA/JEE","je sais pas c'est quoi 1");
        Specialite prof2 = new Specialite(2,"Poitras","Nicholas","514-928-2321","NicolPoitras@gmail.com","CISCO","je sais pas c'est quoi 2");

        System.out.println(prof1.toString());
        System.out.println(prof2.toString()); //pas reussie le auto increment

    }
}
