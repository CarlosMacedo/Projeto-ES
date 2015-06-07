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
