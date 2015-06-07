package prontuario.model;

import java.util.Calendar;

public class FormularioDeInternacao {
	private String nomeClinica;
	private String diagnosticoProvisorio;
	private Calendar dataDaInternacao;
	private Medico medicoResponsavel;
	
	public FormularioDeInternacao(String nomeClinica, String diagnosticoProvisorio,
			Calendar dataDaInternacao, Medico medicoResponsavel){
		this.setNomeClinica(nomeClinica);
		this.setDiagnosticoProvisorio(diagnosticoProvisorio);
		this.setDataDaInternacao(dataDaInternacao);
		this.setMedicoResponsavel(medicoResponsavel);
	}
	
	public String getNomeClinica() {
		return nomeClinica;
	}
	
	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}
	
	public String getDiagnosticoProvisorio() {
		return diagnosticoProvisorio;
	}
	
	public void setDiagnosticoProvisorio(String diagnosticoProvisorio) {
		this.diagnosticoProvisorio = diagnosticoProvisorio;
	}
	
	public Calendar getDataDaInternacao() {
		return dataDaInternacao;
	}
	
	public void setDataDaInternacao(Calendar dataDaInternacao) {
		this.dataDaInternacao = dataDaInternacao;
	}
	
	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}
	
	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}
	
	
}
