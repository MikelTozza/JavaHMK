package sample.Client.Delete;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static javax.swing.JOptionPane.showMessageDialog;

public class DeletePage {
 @FXML TextField Numero;

    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void delete(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();

            String numero = Numero.getText();

            String q1 = "DELETE from clients WHERE numero = '" + numero +
                    "' ";
            String query = "SELECT * FROM clients WHERE numero ='"+numero+ "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");



                // print the results
                showMessageDialog(null,"Successfully deleted client " + prenom + nom);
            }
            st.executeUpdate(q1);
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    }

