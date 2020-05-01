package sample.Facture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Facture implements Initializable {

    @FXML TextField NumeroClientText;
    @FXML TextArea NomClientText;
    @FXML TextArea PrenomClientText;
    @FXML TextArea NumeroContratText;
    @FXML TextArea CompteurText;
    @FXML TextArea KWHText;
    @FXML TextArea TotalPartielText;
    @FXML TextArea TPSText;
    @FXML TextArea TVQText;
    @FXML TextArea TotalText;
    @FXML TextArea DateText;
    @FXML TextArea DureeContratText;
    @FXML TextArea TarifText;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    public void populateTextbox(ActionEvent actionEvent){

        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String numeroClient = NumeroClientText.getText();
            String query="SELECT C.numero, C.nom, C.prenom, P.numero, P.dateContrat,P.dureeContrat,P.contractNumber,P.compteur,P.puissance,P.tarif FROM clients C INNER JOIN contract P WHERE P.numero = C.numero AND P.contractNumber = '"+ numeroClient+"'";

            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                int numeroContrat = rs.getInt("numero");
                String nom = rs.getString("nom");
                String Prenom = rs.getString("prenom");
                String dateContrat = rs.getString("dateContrat");
                int dureeContrat = rs.getInt("dureeContrat");
                int Compteur = rs.getInt("compteur");
                int Puissance = rs.getInt("puissance");
                int Tarif = rs.getInt("tarif");


                NumeroContratText.appendText(""+numeroContrat);
                NomClientText.appendText(""+nom);
                PrenomClientText.appendText(""+Prenom);
                CompteurText.appendText(""+Compteur);
                DateText.appendText(""+dateContrat);
                DureeContratText.appendText(""+dureeContrat+" jour");
                KWHText.appendText(""+Puissance+" kWh");
                TarifText.appendText(""+Tarif+" $");
                calculFacture();

            }
            conn.close();
        }catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
    public void calculFacture() {
        String numeroClient = NumeroClientText.getText();
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String query="SELECT puissance,tarif,dureeContrat FROM contract where contractNumber ='"+ numeroClient+ "' ";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int Puissance = rs.getInt("puissance");
                int Tarif = rs.getInt("tarif");
                int Duree = rs.getInt("dureeContrat");
                double totalPartiel = (Puissance*Tarif)*Duree;
                double tps = 0.05 * totalPartiel;
                double tvq = 0.0975 * totalPartiel;
                double total = totalPartiel + tps +tvq;

                TotalPartielText.appendText("" + totalPartiel+ " $");
                TPSText.appendText("" + tps+ " $");
                TVQText.appendText("" + tvq+ " $");
                TotalText.appendText("" + total+ " $");
            }
            conn.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
    public void clear(){
        NumeroClientText.clear();
        NomClientText.clear();
        PrenomClientText.clear();
        NumeroContratText.clear();
        CompteurText.clear();
        KWHText.clear();
        TotalPartielText.clear();
        TPSText.clear();
        TVQText.clear();
        TotalText.clear();
        DateText.clear();
        DureeContratText.clear();
        TarifText.clear();
    }

}
