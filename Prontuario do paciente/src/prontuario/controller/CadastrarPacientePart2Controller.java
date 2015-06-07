package prontuario.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastrarPacientePart2Controller {

    @FXML
    private PasswordField txNomePai;

    @FXML
    private TextField txNumRegistro;

    @FXML
    private Label lbTitulo;

    @FXML
    private PasswordField txLocalNascimento;

    @FXML
    private TextField txNomeMae;

    @FXML
    private ToggleGroup estadoCivil;

    @FXML
    private TextField txProfissao;

    @FXML
    private RadioButton rbSolteiro;

    @FXML
    private TextField txNomeConjuge;

    @FXML
    private RadioButton rdCasado;

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {

    }

    @FXML
    void confirmar(ActionEvent event) {

    }

}

