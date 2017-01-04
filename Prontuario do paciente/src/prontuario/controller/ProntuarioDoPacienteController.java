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
import java.util.ResourceBundle;

import prontuario.LoginApp;
import prontuario.TelaPrincipalApp;
import prontuario.model.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;



public class ProntuarioDoPacienteController implements Initializable {

    @FXML
    private MenuButton btConsultas;

    @FXML
    private MenuButton btCalendarioDeConsultas;

    @FXML
    private Button btConsideracoesEQueixas;

    @FXML
    private Button btVisualizarProprioProntuario;

    @FXML
    private Button btPesquisarProntuario;

    @FXML
    private Button btDadosEstatisticos;

    @FXML
    private MenuButton btCadastrar;

    @FXML
    private Button btAlertasLembretes;

    @FXML
    private Button btEditarConta;

    @FXML
    void alertasLembretes(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "AlertasLembretes.fxml", "Alertas e Lembretes: Prontuario do Paciente");
    }

    @FXML
    void cadastrarMedico(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "CadastrarMedicoPart1.fxml", "Cadastrando novo medico: Prontuario do Paciente");
    }

    @FXML
    void cadastrarPaciente(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "CadastrarPacientePart1.fxml", "Cadastrando novo paciente: Prontuario do Paciente");
    }

    @FXML
    void cadastrarConvenio(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "CadastrarConvenio.fxml", "Cadastrando novo convenio: Prontuario do Paciente");
    }

    @FXML
    void editarOuExcluirMedico(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "ExcluirMedico.fxml", "Editando/Excluindo medico: Prontuario do Paciente");
    }

    @FXML
    void editarOuExcluirPaciente(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "ExcluirPaciente.fxml", "Editando/Excluindo paciente: Prontuario do Paciente");
    }

    @FXML
    void editarOuExcluirConvenio(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "ExcluirConvenio.fxml", "Editando/Excluindo convenio: Prontuario do Paciente");
    }

    @FXML
    void dadosEstatisticos(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "DadosEstatisticos.fxml", "Dados estatisticos: Prontuario do Paciente");
    }

    @FXML
    void editarConta(ActionEvent event) throws IOException {
    	if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Adminstrador")) {
    		TelaPrincipalApp.initTela("BorderPane", "EditarDadosAdmin.fxml", "Editar conta: Prontuario do Paciente");
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Medico")) {
			TelaPrincipalApp.initTela("BorderPane", "CadastrarMedicoPart1.fxml", "Editar conta: Prontuario do Paciente");
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Paciente")) {
			TelaPrincipalApp.initTela("BorderPane", "CadastrarPacientePart1.fxml", "Editar conta: Prontuario do Paciente");
		}
    }

    @FXML
    void visualizarProprioProntuario(ActionEvent event) throws IOException {
    	//lembrar de tirar a edicao atraves do if que coloquei em AbreProntuarioDoPaciente
    	TelaPrincipalApp.initTela("BorderPane", "AbrirProntuarioDoPaciente.fxml", "Visualizando: Prontuario do Paciente");
    }

    @FXML
    void consideracoesEQueixas(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "Queixas.fxml", "Enviando queixa: Prontuario do Paciente");
    }

    @FXML
    void pesquisarProntuario(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "AbrirProntuarioDoPaciente.fxml", "Pesquisar: Prontuario do Paciente");
    }

    @FXML
    void agendarConsultas(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "PacienteConsultaAgendar.fxml", "Agendar consulta: Prontuario do Paciente");
    }

    @FXML
    void desmarcarConsultas(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "DesmarcarConsulta.fxml", "Desmarcar Consultas: Prontuario do Paciente");
    }

    @FXML
    void visualizarCalendarioDeConsultas(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "DesmarcarConsulta.fxml", "Consultas: Prontuario do Paciente");
    }

    @FXML
    void addHorarioDisponivel(ActionEvent event) throws IOException {
    	TelaPrincipalApp.initTela("BorderPane", "CalendarioConsultaHorario.fxml", "Horario: Prontuario do Paciente");
    }

    @FXML
    void comoComecar(ActionEvent event) {

    }

    @FXML
    void deslogar(ActionEvent event) {
    	new LoginApp().start(new Stage());
    	TelaPrincipalApp.getStage().close();  
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Adminstrador")) {
			btCadastrar.setVisible(true);
			btDadosEstatisticos.setVisible(true);
			btEditarConta.setVisible(true);
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Medico")) {
			btDadosEstatisticos.setVisible(true);
			btEditarConta.setVisible(true);
			btEditarConta.setDisable(true);
			btAlertasLembretes.setVisible(true);
			btCalendarioDeConsultas.setVisible(true);
			btPesquisarProntuario.setVisible(true);
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Paciente")) {
			btEditarConta.setVisible(true);
			btEditarConta.setDisable(true);
			btAlertasLembretes.setVisible(true);
			btConsideracoesEQueixas.setVisible(true);
			btConsultas.setVisible(true);
			btVisualizarProprioProntuario.setVisible(true);
		} else if (Sistema.getUsuarioLogado().getClass().getSimpleName().equals("Convidado")) {
			btDadosEstatisticos.setVisible(true);
		}
		
	}

}