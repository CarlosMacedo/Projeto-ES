package prontuario.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Adminstrador;
import prontuario.model.Endereco;
import prontuario.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastrarMedicoPart2Controller {
	
	@FXML
    private TextField txRua;

    @FXML
    private TextField txCep;

    @FXML
    private TextField txNumero;

    @FXML
    private TextField txUF;

    @FXML
    private TextField txBairro;

    @FXML
    private TextField txCidade;

    @FXML
    private Label lbTitulo;

    @FXML
    private TextField txComplemento;

    @FXML
    void cancelar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "CadastrarMedicoPart1.fxml", "Cadastrando medico: Prontuario do Paciente");
    }

    @FXML
    void confirmar(ActionEvent event) {
       	Adminstrador adm = Adminstrador.getInstance();
    	Medico medico = CadastrarMedicoPart1Controller.medico;	//Pegando parte um do cadastro
    	
    	try {
	    	medico.setEndereco(
	    			new Endereco(txUF.getText(), txCidade.getText(), txRua.getText(),
	    					txBairro.getText(), txComplemento.getText(), Integer.parseInt(txNumero.getText()),
	    					txCep.getText()));
    	} catch (NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "O 'Número' não pode conter letras.");
    	}
    	
    	try {
			adm.cadastrarMedico(medico);
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
	    	TelaPrincipalApp.initTela("BorderPane");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Login e Crm devem ser únicos.");
		} catch (NullPointerException e) {
			
		}
    	    	
    }  
}


