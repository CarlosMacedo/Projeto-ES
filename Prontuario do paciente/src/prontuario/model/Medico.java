/**
 * Copyright 2017 Carlos Mac�do
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
package prontuario.model;

import java.sql.SQLException;
import java.util.Date;

import prontuario.utilites.Banco;

public class Medico extends Usuario implements FuncionalidadesExtras {
	
	private String crm;
	private String especialidade;
	private Calendario calendario;
	
	
	public Medico(String login, String senha, String nome, String telefone,
			Endereco endereco, String cpf, Rg rg, String email, String sexo,
			Date data,
			String crm, String especialidade, Calendario Calendario) throws SQLException {
		super(login, senha, nome, telefone, endereco, cpf, rg, email, sexo, data);
		this.setCrm(crm);
		this.setEspecialidade(especialidade);
		this.setCalendario(calendario);
		
	}

	@Override
	public void removerConsulta(Consulta c) throws SQLException {
		Banco banco = new Banco();
    	banco.conexao();
    	
		banco.executar("DELETE FROM agendar_consulta_paciente "
				+ "WHERE login_medicofk = '"+ this.getLogin() +"' AND "
						+ "data_consulta = '"+ c.getData() +"' AND hora_inicio_consulta = '"+ c.getHorario() +"'");
		
	}
	
	@Override
	public void visualizarDadosEstatisticos() {
		// TODO Auto-generated method stub
		
	}
	
	public void editarProntuario(Paciente paciente){
		
	}
	
	public void visualizarProntuario(Paciente paciente){
		
	}
	
	public void addHorarioDisponivel(String data, int horaInicio) throws SQLException{
		Banco b = new Banco();
		b.conexao();
		b.executar("INSERT INTO horario_disponivel_medico (login_medicofk, data, hora) "
				+ "VALUES ('"+ this.getLogin() +"', '"+ data +"', '"+ horaInicio +"')");
	}
	
	public void removerHorarioDisponivel(Calendario c) throws SQLException{
		Banco b = new Banco();
		b.conexao();
		b.executar("DELETE FROM horario_disponivel_medico "
				+ "WHERE login_medicofk = '"+ this.getLogin() +"'AND data = '"+ c.getData() +"'AND hora = "+ c.getHora() +"");
	}

	public void visualizarLembrete(){
		
	}
	
	public String getCrm() {
		return crm;
	}


	public void setCrm(String crm) {
		this.crm = crm;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public Calendario getCalendario() {
		return calendario;
	}


	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

	

}
