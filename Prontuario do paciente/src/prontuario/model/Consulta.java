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

public class Consulta {
	private String horario;
	private String data;
	private String idPaciente;
	private String idMedico;
	
	public Consulta(String horario, String data, String paciente, String medico) {
		this.setHorario(horario);
		this.setData(data);
		this.setPaciente(paciente);
		this.setMedico(medico);
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPaciente() {
		return idPaciente;
	}

	public void setPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getMedico() {
		return idMedico;
	}

	public void setMedico(String idMedico) {
		this.idMedico = idMedico;
	}
	
}
