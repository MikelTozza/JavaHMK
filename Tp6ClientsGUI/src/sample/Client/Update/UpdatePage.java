package sample.Client.Update;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class UpdatePage {

    @FXML
    TextField Numero;
    @FXML
    TextField Nnom;
    @FXML
    TextField Nprenom;
    @FXML
    TextField Ndate;
    @FXML
    TextField Nadresse;
    @FXML
    TextField Ntel;
    @FXML
    TextField Nemail;
    @FXML
    TextField Ntype;

    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void Update(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();


            String numero = Numero.getText();
            String nom = Nnom.getText();
            String prenom = Nprenom.getText();
            String date_nais = Ndate.getText();
            String adresse = Nadresse.getText();
            String telephone = Ntel.getText();
            String email = Nemail.getText();
            String type = Ntype.getText();

            PreparedStatement update = conn.prepareStatement
                    ("UPDATE clients SET nom = ?, prenom = ?, date_nais = ?, adresse = ?, telephone= ?, email = ?, type = ?  WHERE numero = ?");

            update.setString(1, nom);
            update.setString(2, prenom);
            update.setString(3, date_nais);
            update.setString(4, adresse);
            update.setString(5, telephone);
            update.setString(6, email);
            update.setString(7, type);
            update.setString(8, numero);

            update.executeUpdate();

            conn.close();
            if(st == null){
                showMessageDialog(null,"Please enter Data");
            }
            showMessageDialog(null,"Successfully updated client " + numero+" "+nom);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
