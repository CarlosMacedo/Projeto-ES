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
