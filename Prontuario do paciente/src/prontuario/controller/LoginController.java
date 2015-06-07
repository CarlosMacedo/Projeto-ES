package prontuario.controller;

import java.sql.SQLException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

import prontuario.LoginApp;
import prontuario.TelaPrincipalApp;
import prontuario.model.Adminstrador;
import prontuario.model.Convidado;
import prontuario.model.Endereco;
import prontuario.model.Medico;
import prontuario.model.Paciente;
import prontuario.model.Rg;
import prontuario.model.Sistema;
import prontuario.utilites.Banco;

public class LoginController {
	
	private boolean logado = false;

    @FXML
    private PasswordField txSenha;

    @FXML
    private TextField txLogin;

    @FXML
    void entrar(ActionEvent event) {     	
    	if (!logado) {
    		logarAdm();
    	} if (!logado) {
    		logarPaciente();
    	} if (!logado) {
    		logarMedico();
    	} if (!logado) {
    		logarConvidado();
    	} if (!logado) {
    		JOptionPane.showMessageDialog(null, "Id ou Senha incorreta, tente novamente.");
    	}
    	
    }
    
    private void initTelaPrincipal(){
    	new TelaPrincipalApp().start(new Stage());
		LoginApp.getStage().close();
    }
        
    /*Tratamento de login, para a tela
     * ser aberta conforme as permições de users
     * */
    private void logarAdm(){
    	Adminstrador adm = Adminstrador.getInstance();    //adm	
    	if (txLogin.getText().equals( adm.getLogin() ) &&
    			txSenha.getText().equals( adm.getSenha() )) {
    		
    		Sistema.setUsuarioLogado( Adminstrador.getInstance() );
    		logado = true;
    		initTelaPrincipal();    		
    	}
    }
    
    @SuppressWarnings("deprecation")
	private void logarPaciente(){
    	Banco banco = new Banco();
    	banco.conexao();
    	
    	banco.executaConsultas("SELECT * FROM paciente");
    	try {
			while(banco.rs.next()){
				if ( txLogin.getText().equals( banco.rs.getString("login") ) &&
		    			txSenha.getText().equals( banco.rs.getString("senha") ) ) {
					Sistema.setUsuarioLogado( new Paciente(banco.rs.getString("login"), //login
							banco.rs.getString("senha"), //senha
							banco.rs.getString("nome"), //nome
							banco.rs.getString("telefone"), //telefone
							new Endereco(banco.rs.getString("uf_end"), banco.rs.getString("cidade_end"),
									banco.rs.getString("rua_end"), banco.rs.getString("bairro_end"), 
									banco.rs.getString("complemento_end"), banco.rs.getInt("num_end"),
									banco.rs.getString("cep_end")), //endereço
							banco.rs.getString("cpf"), //cpf
							new Rg(banco.rs.getString("num_rg"), 
									new Date(banco.rs.getInt("ano_rg"), banco.rs.getInt("mes_rg"), banco.rs.getInt("dia_rg")),
									banco.rs.getString("uf_rg"), banco.rs.getString("orgao_rg")),  //rg
							banco.rs.getString("email"), //email
							banco.rs.getString("sexo"), //sexo
							new Date(banco.rs.getInt("ano_nascimento"), banco.rs.getInt("mes_nascimento"), banco.rs.getInt("dia_nascimento")) //data de nascimento
							) );
					logado = true;
		    		initTelaPrincipal();
		    		
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel completar busca do paciente: "+ e.getMessage());
		}
    }
    
    @SuppressWarnings("deprecation")
	private void logarMedico(){
    	Banco banco = new Banco();
    	banco.conexao();
    	
    	banco.executaConsultas("SELECT * FROM medico");
    	try {
			while(banco.rs.next()){
				if ( txLogin.getText().equals( banco.rs.getString("login") ) &&
		    			txSenha.getText().equals( banco.rs.getString("senha") ) ) {
					Sistema.setUsuarioLogado( new Medico(banco.rs.getString("login"), //login
							banco.rs.getString("senha"), //senha
							banco.rs.getString("nome"), //nome
							banco.rs.getString("telefone"), //telefone
							new Endereco(banco.rs.getString("uf_end"), banco.rs.getString("cidade_end"),
									banco.rs.getString("rua_end"), banco.rs.getString("bairro_end"), 
									banco.rs.getString("complemento_end"), banco.rs.getInt("num_end"),
									banco.rs.getString("cep_end")), //endereço
							banco.rs.getString("cpf"), //cpf
							new Rg(banco.rs.getString("num_rg"), 
									new Date(banco.rs.getInt("ano_rg"), banco.rs.getInt("mes_rg"), banco.rs.getInt("dia_rg")),
									banco.rs.getString("uf_rg"), banco.rs.getString("orgao_rg")),  //rg
							banco.rs.getString("email"), //email
							banco.rs.getString("sexo"), //sexo
							new Date(banco.rs.getInt("ano_nascimento"), banco.rs.getInt("mes_nascimento"), banco.rs.getInt("dia_nascimento")), //data de nascimento
							banco.rs.getString("crm"),//crm
							banco.rs.getString("especialidade"),//especialidade
							null //calendario
							) );
					logado = true;
		    		initTelaPrincipal();		    		
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel completar busca do medico: "+ e.getMessage());
		}
    }
    
    private void logarConvidado(){
    	Banco banco = new Banco();
    	banco.conexao();
    	
    	banco.executaConsultas("SELECT * FROM convidado");
    	try {
			while(banco.rs.next()){
				if ( txLogin.getText().equals( banco.rs.getString("login") ) &&
		    			txSenha.getText().equals( banco.rs.getString("senha") ) ) {
					Sistema.setUsuarioLogado( new Convidado(banco.rs.getString("login"), //login
							banco.rs.getString("senha"))); //senha
					logado = true;
		    		initTelaPrincipal();		    		
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel completar busca do convidado: "+ e.getMessage());
		}
    }
    
}