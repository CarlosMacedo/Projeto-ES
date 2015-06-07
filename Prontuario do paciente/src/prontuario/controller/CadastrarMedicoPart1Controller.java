package prontuario.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Medico;
import prontuario.model.Rg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastrarMedicoPart1Controller {

	static Medico medico; //medico que será cadastrado
	
	@FXML
    private TextField txCrm;

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
    private TextField txEspecialidade;

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

    @FXML
    private TextField txLogin;

    @FXML
    private TextField txRgUf;

    @FXML
    void cancelar(ActionEvent event) {
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
    		try {
				initCadastrar();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar.");
			} 
    	}	
    }

    @SuppressWarnings("deprecation")
	private void initCadastrar() throws IOException {
    	try {
			//Tratamento da data
    		String dN = dpDataDeNascimento.getValue().toString();
    		String dR = txRgData.getValue().toString();
    		String[] dataNascimento = dN.split("-");
    		String[] dataRg = dR.split("-");
    		
    		//Tratamento do sexo
    		String sex = null;
        	if ( sexo.getSelectedToggle().toString().contains("Masculino") ) {
        		sex = "Masculino";
        		
        	} else if ( sexo.getSelectedToggle().toString().contains("Feminino") ) {
        		sex = "Feminino";
        		
        	}
    		
    		//Enviar Dados estatisticos para segunda parte;
        	try {
				medico = new Medico(
						txLogin.getText(), txSenha.getText(), 						//login, senha
						txNomeCompleto.getText(), txTelefone.getText(), 			//nome, telefone
						null, txCpf.getText(), 										//endereco, cpf
						new Rg(txRgNumero.getText(), 
									new Date(Integer.parseInt(dataRg[0]), 
											Integer.parseInt(dataRg[1]),
											Integer.parseInt(dataRg[2])),
									txRgUf.getText(), txRgOrgao.getText()),			//rg
						txEmail.getText(), sex, 									//email, sexo
						new Date(Integer.parseInt(dataNascimento[0]), 
								Integer.parseInt(dataNascimento[1]), 
								Integer.parseInt(dataNascimento[2])),				//nascimento
						txCrm.getText(), txEspecialidade.getText(), 				//crm, especialidade
						null);
				
				TelaPrincipalApp.initTela("BorderPane", "CadastrarMedicoPart2.fxml", "Cadastrando medico: Prontuario do Paciente");
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato invalido, por favor insira um inteiro.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 														//calendario
        	
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "As datas devem serem preenchidas.");
		}   //catch para login ou crm repetido 	
    }
    
}

