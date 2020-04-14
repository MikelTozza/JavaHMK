package sample.Select;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static javax.swing.JOptionPane.showMessageDialog;


public class SelectPage {
    @FXML TextField Nom;
    @FXML Button Find;
    @FXML TextArea InfoField;

    public void Select(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();

            String nom = Nom.getText();

            String query = "SELECT * FROM clients WHERE nom ='"+ nom + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                int id = rs.getInt("numero");
                String nom1 = rs.getString("nom");
                String Prenom = rs.getString("prenom");
                String date_nais = rs.getString("date_nais");
                String adresse = rs.getString("adresse");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String type = rs.getString("type");

                InfoField.appendText(" "+id+", \n"+nom1+", \n"+Prenom+", \n"+date_nais+", \n"+adresse+", \n"+telephone+", \n"+email+", \n"+type); //lamon gottiiiii


            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }



}
