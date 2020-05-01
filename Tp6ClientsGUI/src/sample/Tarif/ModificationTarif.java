package sample.Tarif;

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
import java.sql.PreparedStatement;
import java.sql.Statement;

import static javax.swing.JOptionPane.showMessageDialog;

public class ModificationTarif {

    @FXML TextField Tarif;
    @FXML TextField IdTarif;


    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    public void modify(ActionEvent actionEvent){
        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String id = IdTarif.getText();
            String tarif = Tarif.getText();

            PreparedStatement update = conn.prepareStatement
                    ("UPDATE tarif SET tarif = '" + tarif + "' WHERE id = '" + id + "'");


            update.setString(1, tarif);
            update.executeUpdate();

            conn.close();
            if(st == null){
                showMessageDialog(null,"Please enter Data");
            }
            showMessageDialog(null,"Successfully updated tarif # " + id);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
