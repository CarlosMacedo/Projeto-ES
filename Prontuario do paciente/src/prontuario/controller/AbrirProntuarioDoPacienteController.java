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
import prontuario.model.Pessoa;
import prontuario.model.Queixas;
import prontuario.model.Sistema;
import prontuario.utilites.Banco;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

public class AbrirProntuarioDoPacienteController implements Initializable {

    @FXML
    private TextField txAnamneseSistemaMuscularEsquel;

    @FXML
    private Label lbSexo;

    @FXML
    private Label lbConvenio;

    @FXML
    private Label lbNomeDoConjuge;

    @FXML
    private Label txAnamneseTratPers;

    @FXML
    private Label lbDataDeNascimento;

    @FXML
    private DatePicker dpDataDaInternacao;

    @FXML
    private TextField txAnamneseSistArticular;

    @FXML
    private Label lbUf;

    @FXML
    private Label txAnamneseSistArt;

    @FXML
    private TableColumn<?, ?> clDataDeAlta;

    @FXML
    private TableColumn<Queixas, String> clMotivoQueixa;

    @FXML
    private TableColumn<?, ?> clDiagnostico;

    @FXML
    private Label lbEmail;

    @FXML
    private Label txAnamneseAntecedentPesso;

    @FXML
    private TextField txAnamneseAparelhoGeniturinario;

    @FXML
    private Label txAnamneseAparAuditiv;

    @FXML
    private Label lbEstadoCivil;

    @FXML
    private TableView<?> tbBoletimDeAlta;

    @FXML
    private TableColumn<?, ?> clProcedimentosRealizados;

    @FXML
    private Label lbBairro;

    @FXML
    private TableColumn<?, ?> clCondicoesDoPaciente;

    @FXML
    private Label lbRua;

    @FXML
    private TextField txAnamneseDoencaAtual;

    @FXML
    private Label txAnamneseTabagismo;

    @FXML
    private TextField txAnamneseSistemaCardiovascular;

    @FXML
    private Label lbNomeDaMae;

    @FXML
    private TextField txAnamneseAparelhoVisu;

    @FXML
    private Button btSalvar;

    @FXML
    private Label lbProfissao;

    @FXML
    private TextField txNomeDaClinica;

    @FXML
    private TableColumn<?, ?> clNomeDoenca;

    @FXML
    private TextField txAnamneseSistemaDigestorio;

    @FXML
    private Label lbCidade;

    @FXML
    private TextField txAnamneseSistemaTegumentar;

    @FXML
    private TextField txAnamneseSistemaNervoso;

    @FXML
    private TableColumn<?, ?> clMedicamentoPrincipal;

    @FXML
    private Label lbCpf;

    @FXML
    private ChoiceBox<?> cbMedicoResponsavel;

    @FXML
    private TableColumn<?, ?> clExameRealizado;

    @FXML
    private TextField txAnamneseInformante;

    @FXML
    private TableView<Queixas> tbQueixas;

    @FXML
    private Label lbNumRegistro;

    @FXML
    private TableView<?> tbEvolucoDaDoenca;

    @FXML
    private Label lbCep;

    @FXML
    private HBox hbPesquisa;

    @FXML
    private TextField txPesquisarProntuario;

    @FXML
    private Label lbNumero;

    @FXML
    private TextField txAnamneseQueixaPrincipal;

    @FXML
    private TableColumn<?, ?> clEvolucaoDoenca;

    @FXML
    private Label lbTelefone;

    @FXML
    private TableColumn<Queixas, String> clQueixa;

    @FXML
    private Label lbLocalDeNascimento;

    @FXML
    private TextField txDiagnosticoProvisorio;

    @FXML
    private Label lbComplemento;

    @FXML
    private TableColumn<Queixas, Date> clDataQueixa;

    @FXML
    private TextField txAnamneseinterrogatorio;

    @FXML
    private Label lbRg;

    @FXML
    private Label lbNomeDoPai;

    @FXML
    private Label lbNome;

    @FXML
    private Label txAnamneseTratAnter;

    @FXML
    private Label txAnamneseAntecendFami;
    
    @FXML
    private Button btPesquisarProntuario;

    private ObservableList<Queixas> listaQueixa; 
    
    public AbrirProntuarioDoPacienteController() {
    	this.listaQueixa = FXCollections.observableArrayList();
	}
    
    @FXML
    void salvarinformacoes(ActionEvent event) {

    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

    @FXML
    void pesquisarProntuario(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Para impedir do usuario pesquisar outros prontuarios e aparecer os dados dele
		if(Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Paciente")){
			initDadosPaciente();			
		}
		
	}

	@SuppressWarnings("deprecation")
	private void initDadosPaciente(){
		txPesquisarProntuario.setVisible(false);
		btPesquisarProntuario.setVisible(false);
		
		
		Pessoa paciente = Sistema.getUsuarioLogado();
		Banco b = new Banco();
		b.conexao();
		b.executaConsultas("SELECT * FROM paciente "
				+ "WHERE login = '"+ paciente.getLogin() +"' ");
		try {
			b.rs.first();
			lbNome.setText(b.rs.getString("nome"));
			lbCpf.setText(b.rs.getString("cpf"));
			lbEmail.setText(b.rs.getString("email"));
			lbSexo.setText(b.rs.getString("sexo"));
			lbDataDeNascimento.setText(b.rs.getString("ano_nascimento")+"-"+b.rs.getString("mes_nascimento")+"-"+b.rs.getString("dia_nascimento"));
			lbUf.setText(b.rs.getString("uf_end"));
			lbCidade.setText(b.rs.getString("cidade_end"));
			lbRua.setText(b.rs.getString("rua_end"));
			lbBairro.setText(b.rs.getString("bairro_end"));
			lbComplemento.setText(b.rs.getString("complemento_end"));
			lbNumero.setText(b.rs.getString("num_end"));
			lbCep.setText(b.rs.getString("cep_end"));
			lbRg.setText(b.rs.getString("num_rg"));
			lbConvenio.setText(b.rs.getString("cnpj_conveniofk"));				
			lbTelefone.setText(b.rs.getString("telefone"));
			
			/*Todos os outros atributos
			 * .
			 * .
			 * .
			 * */
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Não possui dados.");
		}
		
		//queixa
		clDataQueixa.setCellValueFactory (new PropertyValueFactory<Queixas, Date>("dataDeEnvio"));
		clMotivoQueixa.setCellValueFactory (new PropertyValueFactory<Queixas, String>("queixa"));
		clQueixa.setCellValueFactory (new PropertyValueFactory<Queixas, String>("motivo"));
		tbQueixas.setItems(listaQueixa);
		
		b.executaConsultas("SELECT * FROM queixa WHERE login_pacientefk = '"+ paciente.getLogin() +"'");
		try {
			while (b.rs.next()) {    
				listaQueixa.add(new Queixas( 
						new Date(b.rs.getInt("ano"), b.rs.getInt("mes"), b.rs.getInt("dia")), 
						b.rs.getString("queixa"), b.rs.getString("motivo")));					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

