package sample;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable { //main page controller

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void createClientPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a client");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Client/Create/CreatePage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void selectClientPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked select a client");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Client/Select/SelectPage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void updateClientPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked update a client");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Client/Update/UpdatePage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void deleteClientPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked delete a client");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Client/Delete/DeletePage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void createContratPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Contrat/create/CreateConPage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void deleteContratPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Contrat/delete/SuppContrat.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void updateContratPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Contrat/update/ModificationContrat.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void facturePage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Facture/Facture.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void tarifPage (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Tarif/ModificationTarif.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    public void tarifPage2 (javafx.event.ActionEvent E) throws IOException {
        System.out.printf("You clicked populateTextbox a contract");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Tarif/AjoutTarif.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) E.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }


}
