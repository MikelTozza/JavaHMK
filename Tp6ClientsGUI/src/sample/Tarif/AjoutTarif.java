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

public class AjoutTarif {

    @FXML TextField IdText;
    @FXML TextField TarifText;

    public void returnHome (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked back");
        Parent home_page_parent = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void Add(ActionEvent actionEvent){

        try {
            String url = "jdbc:mysql://localhost:3308/tp6";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            String id = IdText.getText();
            String tarif = TarifText.getText();



            st.executeUpdate("insert into tarif (tarif,id ) values('" + id + "','" + tarif + "')");
            conn.close();
            if(st == null){
                showMessageDialog(null,"Please enter Data");
            }
            showMessageDialog(null,"Successfully created tarif " + id +" "+ tarif);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
