package sample.create;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static javax.swing.JOptionPane.showMessageDialog;

public class CreatePage {
    @FXML TextField Nom;
    @FXML TextField Prenom;
    @FXML TextField Date_nais;
    @FXML TextField Adresse;
    @FXML TextField Telephone;
    @FXML TextField Email;
    @FXML TextField Type;




    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
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

            String nom = Nom.getText();
            String prenom = Prenom.getText();
            String date_nais = Date_nais.getText();
            String adresse = Adresse.getText();
            String telephone = Telephone.getText();
            String email = Email.getText();
            String type = Type.getText();


            st.executeUpdate("insert into clients (nom, prenom, date_nais, adresse, telephone, email, type) values('" + nom + "', '" + prenom + "', '" + date_nais + "','" + adresse + "', '" + telephone + "', '" + email + "', '" + type + "')");
            conn.close();
            showMessageDialog(null,"Successfully created client " + nom);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

}

