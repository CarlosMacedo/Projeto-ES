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

public class Rg {
	private String num;
	private Date dataDeEmicao;
	private String uf;
	private String orgao;
	
	public Rg(String num, Date DataDeEmicao,
				String uf, String orgao){
		this.setNum(num);
		this.setDataDeEmicao(dataDeEmicao);
		this.setUf(uf);
		this.setOrgao(orgao);
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public Date getDataDeEmicao() {
		return dataDeEmicao;
	}
	
	public void setDataDeEmicao(Date dataDeEmicao) {
		this.dataDeEmicao = dataDeEmicao;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getOrgao() {
		return orgao;
	}
	
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	
	
}
