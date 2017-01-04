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

import java.util.Date;


public class Queixas {
	private Date dataDeEnvio;
	private String queixa;
	private String motivo;
	
	public Queixas(Date dataDeEnvio, String queixa, String motivo) {
		setDataDeEnvio(dataDeEnvio);
		setQueixa(queixa);
		setMotivo(motivo);
	}

	public Date getDataDeEnvio() {
		return dataDeEnvio;
	}
	
	public void setDataDeEnvio(Date dataDeEnvio) {
		this.dataDeEnvio = dataDeEnvio;
	}
	
	public String getQueixa() {
		return queixa;
	}
	
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
