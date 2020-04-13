import java.util.Date;

public class Ouvrage {
private String title;
private  String author;

public Ouvrage(String title,String author){
    this.author = author;
    this.title = title;
}

    public Date emprunte( Ouvrage ouvrage, Date date) {
        Date dateEmprunt = new Date();

        return dateEmprunt;
    }
}
