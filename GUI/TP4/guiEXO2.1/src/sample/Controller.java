package sample;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import static javax.swing.JOptionPane.showMessageDialog;

public class Controller {
    @FXML TextField textboxName;
    @FXML ChoiceBox choiceBoxSexe;
    @FXML TextField textboxTaille;
    @FXML ChoiceBox choiceBoxCheveux;


    public void okButtonClick(){
        String name = textboxName.getText();
        String cheveux = choiceBoxCheveux.getValue().toString();
        String taille = textboxTaille.getText();
        String sexe = choiceBoxSexe.getValue().toString();

        showMessageDialog(null,"Name:" + name+
                "\nCheveux: " + cheveux +
                "\nSexe: " + sexe +
                "\nTaille: " + taille +
                "\nAge: 24"
                );
    }


}
