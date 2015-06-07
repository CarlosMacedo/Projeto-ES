package prontuario.controller;

import java.io.IOException;

import prontuario.TelaPrincipalApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DadosEstatisticosController {

    @FXML
    void fechar(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}
