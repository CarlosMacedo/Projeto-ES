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

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Consulta;
import prontuario.model.Medico;
import prontuario.model.Paciente;
import prontuario.model.Sistema;
import prontuario.utilites.Banco;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DesmarcarConsultaController implements Initializable {

    @FXML
    private TableColumn<Consulta, String> clData;

    @FXML
    private TableColumn<Consulta, String> clNome;

    @FXML
    private TableView<Consulta> tbConsultas;

    @FXML
    private TableColumn<Consulta, String> clHorario;

    private ObservableList<Consulta> listaConsulta; 
    
    public DesmarcarConsultaController() {
    	this.listaConsulta = FXCollections.observableArrayList();
	}
    
    @FXML
    void desmarcarConsulta(ActionEvent event) {
    	Consulta c = tbConsultas.getSelectionModel().getSelectedItem();
    	
    	if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Medico")) {    		
    		initDesmarcarConsultaMedico(c);        	
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Paciente")) {
			initDesmarcarConsultaPaciente(c);				
		} else {
			JOptionPane.showMessageDialog(null, "Você não tem permição para acessar essa tela.");
		}
    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		clData.setCellValueFactory (new PropertyValueFactory<Consulta, String>("data"));
		clHorario.setCellValueFactory (new PropertyValueFactory<Consulta, String>("horario"));

		if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Medico")) {
			initConsultasMedico();			
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Paciente")) {
			initConsultasPaciente();			
		} else {
			JOptionPane.showMessageDialog(null, "Você não tem permição para acessar essa tela.");
		}
		
		tbConsultas.setItems(listaConsulta);
	}

	private void initConsultasPaciente(){
		Banco banco = new Banco();
		banco.conexao();
		
		listaConsulta.clear();
		clNome.setCellValueFactory (new PropertyValueFactory<Consulta, String>("idMedico"));
		
		//consulta
		banco.executaConsultas("SELECT * "
				+ "FROM agendar_consulta_paciente "
				+ "WHERE login_pacientefk = '"+ Sistema.getUsuarioLogado().getLogin() +"'");
		
		try {
			while (banco.rs.next()) {
				listaConsulta.add(new Consulta(
						banco.rs.getString("hora_inicio_consulta"), banco.rs.getString("data_consulta"), 
						banco.rs.getString("login_pacientefk"), banco.rs.getString("login_medicofk")));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não possui consultas");
		}
	}

	private void initConsultasMedico(){
		Banco banco = new Banco();
		banco.conexao();
		
		listaConsulta.clear();
		clNome.setCellValueFactory (new PropertyValueFactory<Consulta, String>("idPaciente"));
					
		banco.executaConsultas("SELECT * "
				+ "FROM agendar_consulta_paciente "
				+ "WHERE login_medicofk = '"+ Sistema.getUsuarioLogado().getLogin() +"'");
		
		try {
			while (banco.rs.next()) {
				listaConsulta.add(new Consulta(
						banco.rs.getString("hora_inicio_consulta"), banco.rs.getString("data_consulta"), 
						banco.rs.getString("login_pacientefk"), banco.rs.getString("login_medicofk")));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não possui consultas");
		}
	}
	
	private void initDesmarcarConsultaMedico(Consulta c){
		Medico m = (Medico) Sistema.getUsuarioLogado();	
    	
    	try {
    		m.removerConsulta(c);	
    		
    		int index = tbConsultas.getSelectionModel().getSelectedIndex();
    		tbConsultas.getItems().remove(index);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Consulta não existe.");
		}
	}
	
	private void initDesmarcarConsultaPaciente(Consulta c){
		Paciente p = (Paciente) Sistema.getUsuarioLogado();	
		try {
			p.removerConsulta(c);
			
			int index = tbConsultas.getSelectionModel().getSelectedIndex();
    		tbConsultas.getItems().remove(index);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Consulta não existe.");
		}
	}
	
}
