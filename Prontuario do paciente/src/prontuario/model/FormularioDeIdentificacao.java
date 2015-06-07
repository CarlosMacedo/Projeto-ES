package prontuario.model;

public class FormularioDeIdentificacao {
	private int numeroRegistro;
	private String localNascimento;
	private String nomeMae;
	private String nomePai;
	private String profissao;
	private String estadoCivil;
	private String nomeConjuge;
	
	public FormularioDeIdentificacao(int numeroRegistro, String localNascimento, String nomeMae,
			String nomePai, String profissao, String estadoCivil, String nomeConjuge){
		this.setNumeroRegistro(numeroRegistro);
		this.setLocalNascimento(localNascimento);
		this.setNomeMae(nomeMae);
		this.setNomePai(nomePai);
		this.setProfissao(profissao);
		this.setEstadoCivil(estadoCivil);
		this.setNomeConjuge(nomeConjuge);
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getLocalNascimento() {
		return localNascimento;
	}
	
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getNomeConjuge() {
		return nomeConjuge;
	}
	
	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
	
	
}
