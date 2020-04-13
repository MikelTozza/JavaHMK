package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import static javax.swing.JOptionPane.showMessageDialog;

public class Controller implements Initializable {
    Double temporaryVar = 0.0;
    Double sum = 0.0;
    boolean isOperatorPressed;
    String operatorPressed = "";
    @FXML TextField textboxCalculate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textboxCalculate.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*([\\.]\\d*)?")) {
                    textboxCalculate.setText(oldValue);
                }
            }
        });
    }

    public void onNumberButtonClick(javafx.event.ActionEvent E){
        if(E.getSource() instanceof Button){ //getSource() is specified by the EventObject class that ActionEvent is a child of (via java.awt.AWTEvent). This gives you a reference to the object that the event came from.
            Button btn = (Button)E.getSource();
            if(isOperatorPressed){
                textboxCalculate.setText(btn.getText().trim());
            }else {
                textboxCalculate.setText(textboxCalculate.getText().trim()+btn.getText().trim());
            }
            isOperatorPressed = false;
        }
    }

    public void onOperatorClick(javafx.event.ActionEvent E){
        if (E.getSource() instanceof Button){
            Button btn = (Button)E.getSource();
            if(!textboxCalculate.getText().isEmpty()){ // if the textfield is empty swwwwoooop in
                temporaryVar = Double.valueOf(textboxCalculate.getText()); // convert the textfield into a double
            }
            switch (operatorPressed){
                case"+":
                    sum+=temporaryVar;
                    break;
                case"-":
                    sum-=temporaryVar;
                    break;
                case"*":
                    sum*=temporaryVar;
                    break;
                case"/":
                    sum/=temporaryVar;
                    break;
            }
            if(btn.getText().equals("=")){
                textboxCalculate.setText(String.valueOf(sum));
                operatorPressed = "";
            } else{
                textboxCalculate.setText("");
                operatorPressed = btn.getText().trim();
            }
            isOperatorPressed = true;
        }

    }

    public void onDeleteClick( javafx.event.ActionEvent E){
        if(textboxCalculate.getText().length() > 0 ){
            //if the text is even remotly filled delete it all
            textboxCalculate.setText(textboxCalculate.getText(0,textboxCalculate.getText().length()
            -1));
        }
    }




//    public void one_click(){
//        number1.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number1.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//
//    }
//    public void two_click(){
//        number2.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number2.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//
//    }
//    public void three_click(){
//        number3.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number3.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void four_click(){
//        number4.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number4.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void five_click(){
//        number5.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number5.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void six_click(){
//        number6.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number6.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void seven_click(){
//        number7.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number7.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void eight_click(){
//        number8.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number8.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void nine_click(){
//        number9.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number9.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void zero_click(){
//        number0.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + number0.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void dot_click(){
//        dot.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + dot.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//
//
//    public void addition(){
//    }
//    public void subtraction(){
//        sub.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + sub.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void division(){
//        division.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + division.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//    public void multiply(){
//        multiply.setOnAction(click -> {
//            String textFieldNewString = textboxCalculate.getText() + multiply.getText();
//            textboxCalculate.setText(textFieldNewString);
//        });
//    }
//
//    public void equal(){
//        String allo =textboxCalculate.getText();
//        int numbers = Integer.parseInt(allo);
//        showMessageDialog(null,"these are the numbers:"+numbers);
//    }


}
