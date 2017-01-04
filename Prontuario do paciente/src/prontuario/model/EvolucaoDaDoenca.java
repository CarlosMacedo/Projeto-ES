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

public class EvolucaoDaDoenca {
	private String nomeDoenca;
	private String evolucao;
	private Calendar data;
	
	public EvolucaoDaDoenca(String nomeDoenca, String evolucao, Calendar data){
		this.setNomeDoenca(nomeDoenca);
		this.setEvolucao(evolucao);
		this.setData(data);
	}
	
	public String getNomeDoenca() {
		return nomeDoenca;
	}
	
	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}
	
	public String getEvolucao() {
		return evolucao;
	}
	
	public void setEvolucao(String evolucao) {
		this.evolucao = evolucao;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
}
