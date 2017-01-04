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

import java.sql.SQLException;

import prontuario.utilites.Banco;

public abstract class Pessoa {
	private String login;
	private String senha;
	
	public Pessoa(String login, String senha) throws SQLException{
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) throws SQLException {
		
		if (this.login != null) {
			Banco banco = new Banco();
			banco.conexao();
			
			banco.executar("UPDATE pessoa"
					+ " SET login='"+ login +"'"
					+ " WHERE login='"+Sistema.getUsuarioLogado().getLogin()+"'");
		}
		
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) throws SQLException {

		if (this.senha != null) {
			Banco banco = new Banco();
			banco.conexao();
			
			banco.executar("UPDATE pessoa"
					+ " SET senha='"+ senha +"'"
					+ " WHERE login='"+Sistema.getUsuarioLogado().getLogin()+"'");
		}

		this.senha = senha;
	}
}
