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
package prontuario.model;

public class Prontuario {
	private FormularioDeIdentificacao formIdentificacao;
	private FormularioDeInternacao formInternacao;
	private FormularioDeAnamnese formAnamnese;
	private FormularioDeExameFisico formExameFisico;
	private EvolucaoDaDoenca evolucaoDoenca;
	private BoletimDeAlta boletimAlta;
	
	
	
	public Prontuario(FormularioDeIdentificacao formIdentificacao,
			FormularioDeInternacao formInternacao,
			FormularioDeAnamnese formAnamnese,
			FormularioDeExameFisico formExameFisico,
			EvolucaoDaDoenca evolucaoDoenca, BoletimDeAlta boletimAlta) {
		this.setFormIdentificacao(formIdentificacao);
		this.setFormInternacao(formInternacao);
		this.setFormAnamnese(formAnamnese);
		this.setFormExameFisico(formExameFisico);
		this.setEvolucaoDoenca(evolucaoDoenca);
		this.setBoletimAlta(boletimAlta);
	}

	public FormularioDeIdentificacao getFormIdentificacao() {
		return formIdentificacao;
	}
	
	public void setFormIdentificacao(FormularioDeIdentificacao formIdentificacao) {
		this.formIdentificacao = formIdentificacao;
	}
	
	public FormularioDeInternacao getFormInternacao() {
		return formInternacao;
	}
	
	public void setFormInternacao(FormularioDeInternacao formInternacao) {
		this.formInternacao = formInternacao;
	}
	
	public FormularioDeAnamnese getFormAnamnese() {
		return formAnamnese;
	}
	
	public void setFormAnamnese(FormularioDeAnamnese formAnamnese) {
		this.formAnamnese = formAnamnese;
	}
	
	public FormularioDeExameFisico getFormExameFisico() {
		return formExameFisico;
	}
	
	public void setFormExameFisico(FormularioDeExameFisico formExameFisico) {
		this.formExameFisico = formExameFisico;
	}
	
	public EvolucaoDaDoenca getEvolucaoDoenca() {
		return evolucaoDoenca;
	}
	
	public void setEvolucaoDoenca(EvolucaoDaDoenca evolucaoDoenca) {
		this.evolucaoDoenca = evolucaoDoenca;
	}
	
	public BoletimDeAlta getBoletimAlta() {
		return boletimAlta;
	}
	
	public void setBoletimAlta(BoletimDeAlta boletimAlta) {
		this.boletimAlta = boletimAlta;
	}
	
	
	
}
