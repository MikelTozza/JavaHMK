package sample.Contrat.create;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

import static javax.swing.JOptionPane.showMessageDialog;

public class CreateConPage implements Initializable {

    @FXML TextField Numero;
    @FXML TextField Date;
    @FXML TextField Duree;
    @FXML TextField Adresse;
    @FXML TextField Compteur;
    @FXML TextField Remise;
    @FXML TextField Oindex;
    @FXML TextField Nindex;
    @FXML TextField Puissance;
    @FXML TextField Tarif;
    @FXML TextField numeroContrat;





    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    public void create(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String numero = Numero.getText();
            String NumeroContrat = numeroContrat.getText();
            String date = Date.getText();
            String duree = Duree.getText();
            String adresse = Adresse.getText();
            String compteur = Compteur.getText();
            String remise = Remise.getText();
            String oindex = Oindex.getText();
            String nindex = Nindex.getText();
            String puissance = Puissance.getText();
            String tarif = Tarif.getText();


            st.executeUpdate("insert into contract (numero,contractNumber, dateContrat, dureeContrat, adresseCon, compteur, remiseZero, ancienIndex, nouvelIndex, puissance,tarif  ) values('" + numero + "','" + NumeroContrat + "', '" + date + "', '" + duree + "','" + adresse + "', '" + compteur + "', '" + remise + "','" + oindex + "','" + nindex + "','" + puissance + "','" + tarif + "')");
            conn.close();
            if(st == null){
                showMessageDialog(null,"Please enter Data");
            }
            showMessageDialog(null,"Successfully created contract " + numero +" "+ adresse);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
