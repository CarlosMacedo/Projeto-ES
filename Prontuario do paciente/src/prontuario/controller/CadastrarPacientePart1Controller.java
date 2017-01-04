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
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Adminstrador;
import prontuario.model.Paciente;
import prontuario.model.Rg;
import prontuario.utilites.Banco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastrarPacientePart1Controller implements Initializable {

	static Paciente paciente; //paciente que será cadastrado
	
    @FXML
    private RadioButton rbMasculino;

    @FXML
    private PasswordField txSenha;

    @FXML
    private PasswordField txRepetirSenha;

    @FXML
    private TextField txRgNumero;

    @FXML
    private DatePicker txRgData;

    @FXML
    private TextField txCpf;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txTelefone;

    @FXML
    private TextField txNomeCompleto;

    @FXML
    private TextField txRgOrgao;

    @FXML
    private Label lbTitulo;

    @FXML
    private RadioButton rdFeminino;

    @FXML
    private DatePicker dpDataDeNascimento;

    @FXML
    private ToggleGroup sexo;

    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox cbConvenio;

    @FXML
    private TextField txLogin;

    @FXML
    private TextField txRgUf;

    @FXML
    void cancelar(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane");
    }

	@FXML
    void avancar(ActionEvent event) {
    	
    	String senhaRepetida = txRepetirSenha.getText();
    	
    	if (!txSenha.getText().equals(senhaRepetida)){
    		JOptionPane.showMessageDialog(null, "Os campos 'Senha' e 'Repetir Senha' devem ser iguais.");
    		
    	} else if (senhaRepetida.equals("") ||
    			txLogin.getText().equals("")) {
    		JOptionPane.showMessageDialog(null, "'Login' e 'Senha' são obrigatórios.");
    		
    	} else {
    		initCadastroPaciente();
    	}
    	
    	
    }

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executaConsultas("SELECT cnpj, nome FROM convenio");
		try {
			while (banco.rs.next()) {
				cbConvenio.getItems().add(banco.rs.getString("nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cbConvenio.getSelectionModel().selectFirst();		
	}

	@SuppressWarnings("deprecation")
	private void initCadastroPaciente(){
		Adminstrador adm = Adminstrador.getInstance();
		
		try {
			
			//Tratamento da data
	    	String dR = txRgData.getValue().toString();
	    	String[] dataRg = dR.split("-");
	    	
	    	String dN = dpDataDeNascimento.getValue().toString();
	    	String[] dataNascimento = dN.split("-");
	    	
	    	//Tratamento do sexo
			String sex = null;
	    	if ( sexo.getSelectedToggle().toString().contains("Masculino") ) {
	    		sex = "Masculino";
	    		
	    	} else if ( sexo.getSelectedToggle().toString().contains("Feminino") ) {
	    		sex = "Feminino";	
	    	}
	    	
	    	try {
				paciente = new Paciente(txLogin.getText(), txSenha.getText(), txNomeCompleto.getText(),
						txTelefone.getText(), 
						null, 
						txCpf.getText(),
						new Rg(txRgNumero.getText(), 
								new Date(Integer.parseInt(dataRg[0]), 
										Integer.parseInt(dataRg[1]),
										Integer.parseInt(dataRg[2])),
								txRgUf.getText(), txRgOrgao.getText()), 
						txEmail.getText(), sex, 
						new Date(Integer.parseInt(dataNascimento[0]), 
								Integer.parseInt(dataNascimento[1]), 
								Integer.parseInt(dataNascimento[2])));
				
				adm.cadastrarPaciente(paciente);
    	    	
    	    	JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
    			TelaPrincipalApp.initTela("BorderPane");
    			
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada invalida, por favor insira um inteiro.");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Login já existe, insira outro.");
			}
			
	    	
			
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "As datas devem serem preenchidas.");
			e.printStackTrace();
		}
	}
}


