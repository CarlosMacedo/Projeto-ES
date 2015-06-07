package prontuario.controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Paciente;
import prontuario.model.Sistema;
import prontuario.utilites.Banco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PacienteConsultaAgendarController implements Initializable {

	@FXML
    private Label lbNomeMedico;
	
    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox clDataConsulta;

    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox cbEspecialidade;

    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox clMedico;
    
    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox cbHoraInicio;

    
    @SuppressWarnings("unchecked")
	@FXML
    void okDataConsulta(ActionEvent event) {
    	Banco b = new Banco();
    	b.conexao();
    	
    	b.executaConsultas("SELECT hora "
    			+ "FROM horario_disponivel_medico "
    			+ "WHERE data = '"+ clDataConsulta.getValue() +"'");
    	try {
			while (b.rs.next()) {
				cbHoraInicio.getItems().add(b.rs.getInt("hora"));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nenhum horario disponivel.");
		}
    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

    @SuppressWarnings("unchecked")
	@FXML
    void okEspecialidade(ActionEvent event) {
    	clMedico.getItems().clear();
    	Banco b = new Banco();
		b.conexao();
		
		b.executaConsultas("SELECT nome, crm FROM medico "
				+ "WHERE especialidade = '"+ cbEspecialidade.getValue() +"'");
		try {
			while (b.rs.next()) {
				clMedico.getItems().add(b.rs.getString("crm"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @SuppressWarnings("unchecked")
	@FXML
    void okMedico(ActionEvent event) {
    	//labNome
    	Banco b = new Banco();
		b.conexao();
		
		b.executaConsultas("SELECT nome FROM medico WHERE crm = '"+ clMedico.getValue() +"'");
    	try {
			b.rs.first();
			lbNomeMedico.setText(b.rs.getString("nome"));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    	
    	
    	//consultas livres
    	clDataConsulta.getItems().clear();
    	
    	b.executaConsultas("SELECT h.data "
				+ "FROM medico m, horario_disponivel_medico h "
				+ "WHERE m.login = h.login_medicofk AND crm = '"+ clMedico.getValue() +"'");
    	
    	try {
			while (b.rs.next()) {
				clDataConsulta.getItems().add(b.rs.getString("data"));    		
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "O medico não possui nenhum horario disponivel.");
		}
			
    	
    	
    }

    @FXML
    void agendar(ActionEvent event) {
    	Banco banco = new Banco();
    	banco.conexao();
    	
    	banco.executaConsultas("SELECT login FROM medico WHERE crm = '"+ clMedico.getValue() +"'");
    	try {
			banco.rs.first();
			String loginMedico = banco.rs.getString("login");
			
			Paciente paciente = (Paciente) Sistema.getUsuarioLogado();
	    	paciente.agendarConsultas(loginMedico, clDataConsulta.getValue().toString(), cbHoraInicio.getValue().toString());
	    	
	    	JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso.");
	    	TelaPrincipalApp.initTela("BorderPane");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Horario já cadastrado por outro paciente.");
		}
    	
    	
    	
    	
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Banco b = new Banco();
		b.conexao();
		
		b.executaConsultas("SELECT DISTINCT especialidade FROM medico");
		try {
			while (b.rs.next()) {
				cbEspecialidade.getItems().add(b.rs.getString("especialidade"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cbEspecialidade.getSelectionModel().selectFirst();
	}

}

