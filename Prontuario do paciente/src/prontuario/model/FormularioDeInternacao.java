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

import java.util.Calendar;

public class FormularioDeInternacao {
	private String nomeClinica;
	private String diagnosticoProvisorio;
	private Calendar dataDaInternacao;
	private Medico medicoResponsavel;
	
	public FormularioDeInternacao(String nomeClinica, String diagnosticoProvisorio,
			Calendar dataDaInternacao, Medico medicoResponsavel){
		this.setNomeClinica(nomeClinica);
		this.setDiagnosticoProvisorio(diagnosticoProvisorio);
		this.setDataDaInternacao(dataDaInternacao);
		this.setMedicoResponsavel(medicoResponsavel);
	}
	
	public String getNomeClinica() {
		return nomeClinica;
	}
	
	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}
	
	public String getDiagnosticoProvisorio() {
		return diagnosticoProvisorio;
	}
	
	public void setDiagnosticoProvisorio(String diagnosticoProvisorio) {
		this.diagnosticoProvisorio = diagnosticoProvisorio;
	}
	
	public Calendar getDataDaInternacao() {
		return dataDaInternacao;
	}
	
	public void setDataDaInternacao(Calendar dataDaInternacao) {
		this.dataDaInternacao = dataDaInternacao;
	}
	
	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}
	
	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}
	
	
}
