package prontuario.model;

import java.util.Date;

public class Convenio {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String registroAns;
	private String url;
	private String codigoPrestador;
	private Date dataDoFaturamento;
	private int quantidadeDeDiasRetorno;
	
	public Convenio(String cnpj, String razaoSocial, String nomeFantasia, String registroAns,
			String url, String codigoPrestador, Date dataDoFaturamento, int quantidadeDeDiasRetorno){
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);
		this.setNomeFantasia(nomeFantasia);
		this.setRegistroAns(registroAns);
		this.setUrl(url);
		this.setCodigoPrestador(codigoPrestador);
		this.setDataDoFaturamento(dataDoFaturamento);
		this.setQuantidadeDeDiasRetorno(quantidadeDeDiasRetorno);		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getRegistroAns() {
		return registroAns;
	}
	
	public void setRegistroAns(String registroAns) {
		this.registroAns = registroAns;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getCodigoPrestador() {
		return codigoPrestador;
	}
	
	public void setCodigoPrestador(String codigoPrestador) {
		this.codigoPrestador = codigoPrestador;
	}
	
	public Date getDataDoFaturamento() {
		return dataDoFaturamento;
	}
	
	public void setDataDoFaturamento(Date dataDoFaturamento) {
		this.dataDoFaturamento = dataDoFaturamento;
	}
	
	public int getQuantidadeDeDiasRetorno() {
		return quantidadeDeDiasRetorno;
	}
	
	public void setQuantidadeDeDiasRetorno(int quantidadeDeDiasRetorno) {
		this.quantidadeDeDiasRetorno = quantidadeDeDiasRetorno;
	}
	
	
}
