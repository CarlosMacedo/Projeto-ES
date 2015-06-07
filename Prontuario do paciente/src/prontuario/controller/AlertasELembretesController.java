package prontuario.controller;

import prontuario.TelaPrincipalApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AlertasELembretesController {

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}

