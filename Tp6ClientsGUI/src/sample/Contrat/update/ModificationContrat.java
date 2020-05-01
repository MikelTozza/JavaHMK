package sample.Contrat.update;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import static javax.swing.JOptionPane.showMessageDialog;

public class ModificationContrat implements Initializable {

    @FXML TextField contratSearch;
    @FXML TextField Date;
    @FXML TextField Duree;
    @FXML TextField Adresse;
    @FXML TextField Compteur;
    @FXML TextField Remise;
    @FXML TextField Oindex;
    @FXML TextField Nindex;
    @FXML TextField Puissance;
    @FXML TextField Tarif;
    @FXML Label label1;
    @FXML Label label2;
    @FXML Label label3;
    @FXML Label label4;
    @FXML Label label5;
    @FXML Label label6;
    @FXML Label label7;
    @FXML Label label8;
    @FXML Label label9;
    @FXML Button update;



    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void search(javafx.event.ActionEvent E) throws IOException {
        try {


            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String contratSearchText = contratSearch.getText();
            String q1 = "SELECT * FROM contract WHERE contractNumber = '" + contratSearchText +
                    "' ";

            ResultSet rs = st.executeQuery(q1);
            while(rs.next() && contratSearchText != null) {
                Date.setVisible(true);
                Duree.setVisible(true);
                Adresse.setVisible(true);
                Compteur.setVisible(true);
                Remise.setVisible(true);
                Oindex.setVisible(true);
                Nindex.setVisible(true);
                Puissance.setVisible(true);
                Tarif.setVisible(true);
                update.setVisible(true);
                Label[] labels = new Label[]{label1, label2, label3, label4, label5, label6, label7, label8, label9};
                for (Label label : labels) {
                    label.setVisible(true);
                }
            }
            conn.close();
        }catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void Update(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String contratSearchText = contratSearch.getText();
            String date = Date.getText();
            String duree = Duree.getText();
            String adresse = Adresse.getText();
            String compteur = Compteur.getText();
            String remise = Remise.getText();
            String oindex = Oindex.getText();
            String nindex = Nindex.getText();
            String puissance = Puissance.getText();
            String tarif = Tarif.getText();

            PreparedStatement update = conn.prepareStatement
                    ("UPDATE contract SET dateContrat = ?, dureeContrat = ?, adresseCon = ?, compteur = ?, remiseZero= ?, ancienIndex = ?, nouvelIndex = ?, puissance = ?, tarif = ?  WHERE contractNumber = '" +contratSearchText + "'");

            update.setString(1, date);
            update.setString(2, duree);
            update.setString(3, adresse);
            update.setString(4, compteur);
            update.setString(5, remise);
            update.setString(6, oindex);
            update.setString(7, nindex);
            update.setString(8, puissance);
            update.setString(9, tarif);


            update.executeUpdate();

            conn.close();
            if(st == null){
                showMessageDialog(null,"Please enter Data");
            }
            showMessageDialog(null,"Successfully updated client " + contratSearchText);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
