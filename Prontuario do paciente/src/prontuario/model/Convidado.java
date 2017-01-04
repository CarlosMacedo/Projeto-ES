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

public class Convidado extends Pessoa implements FuncionalidadesExtras{
	
	public Convidado(String login, String senha) throws SQLException {
		super(login, senha);
		// TODO Auto-generated constructor stub
	}

	public void atualizarIdentificacao(){
		
	}

	@Override
	public void visualizarDadosEstatisticos() {
		// TODO Auto-generated method stub
		
	}
	
}
