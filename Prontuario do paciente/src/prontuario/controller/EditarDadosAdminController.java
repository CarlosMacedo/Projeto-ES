/**
 * Copyright 2017 Carlos Macêdo
 * 
 * This file is part of SeT software.
 * 
 *  SeT is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU General 
 *  Public License as published by the Free Software Foundation, either 
 *  version 3 of the License, or (at your option) any later version.
 *  
 *  SeT is distributed in the hope that
 *  it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 *  the GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with SeT
 *  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  Contact: carlosmacedo025 at gmail dot com
 */
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

