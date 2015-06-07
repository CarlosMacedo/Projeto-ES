package prontuario.model;

public class Endereco {
	private String uf;
	private String cidade;
	private String rua;
	private String bairro;
	private String complemento;
	private int numero;
	private String cep;
	
	public Endereco(String uf, String cidade, String rua, String bairro,
					String complemento, int numero, String cep){
		this.setUf(uf);
		this.setCidade(cidade);
		this.setRua(rua);
		this.setBairro(bairro);
		this.setComplemento(complemento);
		this.setNumero(numero);
		this.setCep(cep);
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
