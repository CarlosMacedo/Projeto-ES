package prontuario.controller;

import prontuario.TelaPrincipalApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ExcluirMedicoController {

    @FXML
    private TableColumn<?, ?> clEmail;

    @FXML
    private TableColumn<?, ?> clCrm;

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
    private TableColumn<?, ?> clEspecialidade;

    @FXML
    private TableView<?> tbMedicos;

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


