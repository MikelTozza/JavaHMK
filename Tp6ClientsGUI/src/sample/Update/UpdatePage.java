package sample.Update;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class UpdatePage {


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

    public void Update(ActionEvent actionEvent) {
        try {
            String url = "jdbc:mysql://localhost:3308/tp6numero2";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Flight number to modify: ");
            String numeroDeVol = input.readLine();

            System.out.print("New departing city: ");
            String villeDepart = input.readLine();

            System.out.print("New arriving city: ");
            String villeArrivee = input.readLine();


            PreparedStatement update = conn.prepareStatement
                    ("UPDATE vols SET villeArrivee = ?, villeDepart = ? WHERE numeroDeVol = ?");

            update.setString(1, villeArrivee);
            update.setString(2, villeDepart);
            update.setString(3, numeroDeVol);

            update.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
