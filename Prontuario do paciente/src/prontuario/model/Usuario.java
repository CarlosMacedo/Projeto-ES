package prontuario.model;

import java.sql.SQLException;
import java.util.Date;

public abstract class Usuario extends Pessoa {

	private String nome;
	private String telefone;
	private Endereco endereco;
	private String cpf;
	private Rg rg;
	private String email;
	private String sexo;
	private Date data;
	
	public Usuario(String login, String senha, String nome, String telefone, Endereco endereco, String cpf, 
			Rg rg, String email, String sexo, Date data) throws SQLException {
		super(login, senha);
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setEmail(email);
		this.setSexo(sexo);
		this.setData(data);
	}	
	
	public abstract void removerConsulta(Consulta c)  throws SQLException ;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Rg getRg() {
		return rg;
	}

	public void setRg(Rg rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
