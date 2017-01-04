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
import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Adminstrador;
import prontuario.model.Convenio;
import prontuario.utilites.Banco;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExcluirConvenioController implements Initializable {

    @FXML
    private TableColumn<Convenio, String> clUrl;

    @FXML
    private TableColumn<Convenio, String> clNome;

    @FXML
    private TableColumn<Convenio, Integer> clQntDiasRetorno;

    @FXML
    private TableView<Convenio> tbConvenios;

    @FXML
    private TableColumn<Convenio, String> clCodigoPrestador;

    @FXML
    private TableColumn<Convenio, String> clDataFaturamento;

    @FXML
    private TableColumn<Convenio, String> clRegistroAns;

    @FXML
    private TableColumn<Convenio, String> clCnpj;

    @FXML
    private TableColumn<Convenio, String> clRazaoSocial;
    
    private ObservableList<Convenio> listaConvenio;

    public ExcluirConvenioController(){
    	this.listaConvenio = FXCollections.observableArrayList();
    }
    
    @FXML
    void remover(ActionEvent event) {
    	Adminstrador adm = Adminstrador.getInstance();
    	Convenio convenio = tbConvenios.getSelectionModel().getSelectedItem();
    	
    	if (convenio != null) {
    		try {
				adm.excluirConvenio(convenio);
				
				int index = tbConvenios.getSelectionModel().getSelectedIndex();
	    		tbConvenios.getItems().remove(index);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Convênio não existe.");
			}
    		
    	} else {
    		JOptionPane.showMessageDialog(null, "Nenhum convênio foi selecionado.");
    	}
    }

    @FXML
    void editar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initColunas();
		initObservablelist();	
	}

	private void initColunas(){
		clCnpj.setCellValueFactory(new PropertyValueFactory<Convenio, String>("cnpj"));
		clRazaoSocial.setCellValueFactory(new PropertyValueFactory<Convenio, String>("razaoSocial"));
		clNome.setCellValueFactory(new PropertyValueFactory<Convenio, String>("nomeFantasia"));
		clRegistroAns.setCellValueFactory(new PropertyValueFactory<Convenio, String>("registroAns"));
		clUrl.setCellValueFactory(new PropertyValueFactory<Convenio, String>("url"));
		clCodigoPrestador.setCellValueFactory(new PropertyValueFactory<Convenio, String>("codigoPrestador"));
		clDataFaturamento.setCellValueFactory(new PropertyValueFactory<Convenio, String>("dataDoFaturamento"));
		clQntDiasRetorno.setCellValueFactory(new PropertyValueFactory<Convenio, Integer>("quantidadeDeDiasRetorno"));
		
		tbConvenios.setItems(listaConvenio);
	}
	
	@SuppressWarnings("deprecation")
	private void initObservablelist(){
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executaConsultas("SELECT * FROM convenio");
		try {
			while (banco.rs.next()) {
				listaConvenio.add(new Convenio(banco.rs.getString("cnpj"), 
						banco.rs.getString("razao_social"), banco.rs.getString("nome"), 
						banco.rs.getString("registro_ans"), banco.rs.getString("url"), 
						banco.rs.getString("codigo_prestador"), 
						new Date(banco.rs.getInt("ano_faturamento"), banco.rs.getInt("mes_faturamento"), banco.rs.getInt("dia_faturamento")), 
						banco.rs.getInt("qnt_dias_retorno")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
