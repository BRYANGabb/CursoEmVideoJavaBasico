package br.com.bryan.olamundofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblMensagem;

    @FXML
    private Button btnClick;

    @FXML
    private void ClicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }
}
