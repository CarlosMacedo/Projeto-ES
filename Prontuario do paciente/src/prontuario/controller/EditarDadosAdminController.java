package prontuario.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Pessoa;
import prontuario.model.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EditarDadosAdminController {

    @FXML
    private TextField txNovaSenha;

    @FXML
    private TextField txNovoLogin;

    @FXML
    private TextField txRepitaSenha;

    @FXML
    void confirmar(ActionEvent event) {
    	String senha = txNovaSenha.getText(), senhaRepetida = txRepitaSenha.getText();
    	Pessoa user = Sistema.getUsuarioLogado();
    	
    	if (senha.equals(senhaRepetida) && !senha.equals("")){
    		try {
				user.setLogin(txNovoLogin.getText());
				user.setSenha(senha);
	    		
	    		JOptionPane.showMessageDialog(null, "Editado com sucesso.");
	    		TelaPrincipalApp.initTela("BorderPane");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Login já existente.");
			}
    		
    	} else {
    		JOptionPane.showMessageDialog(null, "A senha não é equivalente a senha repetida, verifique.");
    	}
    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}

