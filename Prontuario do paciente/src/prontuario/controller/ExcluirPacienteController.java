package prontuario.controller;

import prontuario.TelaPrincipalApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ExcluirPacienteController {

    @FXML
    private TableColumn<?, ?> clEmail;

    @FXML
    private TableColumn<?, ?> clNome;

    @FXML
    private TableColumn<?, ?> clCpf;

    @FXML
    private TableColumn<?, ?> clLogin;

    @FXML
    private TableColumn<?, ?> clSexo;

    @FXML
    private TableColumn<?, ?> clTelefone;

    @FXML
    private TableView<?> tbPacientes;

    @FXML
    private TableColumn<?, ?> clDataDeNascimento;

    @FXML
    void remover(ActionEvent event) {

    }

    @FXML
    void editar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}

