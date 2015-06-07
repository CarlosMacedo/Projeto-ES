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
