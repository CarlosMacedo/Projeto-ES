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
