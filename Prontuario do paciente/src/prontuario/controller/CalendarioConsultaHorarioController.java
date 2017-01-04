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
import prontuario.model.Calendario;
import prontuario.model.Medico;
import prontuario.model.Sistema;
import prontuario.utilites.Banco;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CalendarioConsultaHorarioController {

    @FXML
    private DatePicker dpDataEscolhida;

    @FXML
    private TableColumn<Calendario, Integer> clHorarioDisponiveis;

    @FXML
    private TableColumn<Calendario, String> clData;
    
    @FXML
    private TableView<Calendario> tbHorarios;

    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox cbHorarioInicio;
    
    private ObservableList<Calendario> listaDeHorarios;
    
    public CalendarioConsultaHorarioController(){
    	this.listaDeHorarios = FXCollections.observableArrayList();
    }
    
    @FXML
    void removerHorario(ActionEvent event) {
    	Calendario c = tbHorarios.getSelectionModel().getSelectedItem();
    	Medico m = (Medico) Sistema.getUsuarioLogado();
    	
    	try {
			m.removerHorarioDisponivel(c);
			int index = tbHorarios.getSelectionModel().getSelectedIndex();
	    	tbHorarios.getItems().remove(index);
	    	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Horario não existe.");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Escolha uma data.");
		}
    	
    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

    @FXML
    void adicionarData(ActionEvent event) {
    	try {
    		String dt = dpDataEscolhida.getValue().toString();
    		int horarioInicio = (int) cbHorarioInicio.getValue();
    		
    		Medico medico = (Medico) Sistema.getUsuarioLogado();
    		try {
				medico.addHorarioDisponivel(dt, horarioInicio);
				listaDeHorarios.clear();
	    		initialize();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Horário já está em uso, escolha outro.");
			}
    				
    		
    	} catch (NullPointerException e) {
    		JOptionPane.showMessageDialog(null, "Preencha a data.");
    	}
    }

	@SuppressWarnings("unchecked")
	public void initialize() {
		cbHorarioInicio.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,
				13,14,15,16,17,18,19,20,21,22,23,24);
		cbHorarioInicio.getSelectionModel().selectFirst();
		
		//tabela
		clHorarioDisponiveis.setCellValueFactory (new PropertyValueFactory<Calendario, Integer>("hora"));
		clData.setCellValueFactory (new PropertyValueFactory<Calendario, String>("data"));
		tbHorarios.setItems(listaDeHorarios);
		
		Banco b = new Banco();
		b.conexao();
		
		b.executaConsultas("SELECT * FROM horario_disponivel_medico "
				+ "WHERE login_medicofk = '"+ Sistema.getUsuarioLogado().getLogin() +"'");
		try {
			while (b.rs.next()) {
				listaDeHorarios.add(new Calendario(b.rs.getString("data"), b.rs.getInt("hora")));
			}
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
