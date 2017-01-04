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

public class BoletimDeAlta {
	private String diagnostico;
	private Calendar data;
	private String procedimentosRealizados;
	private String codicaoPaciente;
	private String exameRealizado;
	private String medicamentos;
	
	public BoletimDeAlta(String diagnostico, Calendar data, String procedimentosRealizados,
			String codicaoPaciente, String exameRealizado, String medicamentos){
		this.setDiagnostico(diagnostico);
		this.setData(data);
		this.setProcedimentosRealizados(procedimentosRealizados);
		this.setCodicaoPaciente(codicaoPaciente);
		this.setExameRealizado(exameRealizado);
		this.setMedicamentos(medicamentos);
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public String getProcedimentosRealizados() {
		return procedimentosRealizados;
	}
	
	public void setProcedimentosRealizados(String procedimentosRealizados) {
		this.procedimentosRealizados = procedimentosRealizados;
	}
	
	public String getCodicaoPaciente() {
		return codicaoPaciente;
	}
	
	public void setCodicaoPaciente(String codicaoPaciente) {
		this.codicaoPaciente = codicaoPaciente;
	}
	
	public String getExameRealizado() {
		return exameRealizado;
	}
	
	public void setExameRealizado(String exameRealizado) {
		this.exameRealizado = exameRealizado;
	}
	
	public String getMedicamentos() {
		return medicamentos;
	}
	
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	
}
