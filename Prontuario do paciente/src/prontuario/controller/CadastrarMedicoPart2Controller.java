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


