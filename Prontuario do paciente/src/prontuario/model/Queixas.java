package prontuario.model;

import java.util.Date;


public class Queixas {
	private Date dataDeEnvio;
	private String queixa;
	private String motivo;
	
	public Queixas(Date dataDeEnvio, String queixa, String motivo) {
		setDataDeEnvio(dataDeEnvio);
		setQueixa(queixa);
		setMotivo(motivo);
	}

	public Date getDataDeEnvio() {
		return dataDeEnvio;
	}
	
	public void setDataDeEnvio(Date dataDeEnvio) {
		this.dataDeEnvio = dataDeEnvio;
	}
	
	public String getQueixa() {
		return queixa;
	}
	
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
