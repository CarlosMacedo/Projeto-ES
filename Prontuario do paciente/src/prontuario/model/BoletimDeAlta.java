package prontuario.model;

import java.util.Calendar;

public class BoletimDeAlta {
	private String diagnostico;
	private Calendar data;
	private String procedimentosRealizados;
	private String codicaoPaciente;
	private String exameRealizado;
	private String medicamentos;
	
	public BoletimDeAlta(String diagnostico, Calendar data, String procedimentosRealizados,
			String codicaoPaciente, String exameRealizado, String medicamentos){
		this.setDiagnostico(diagnostico);
		this.setData(data);
		this.setProcedimentosRealizados(procedimentosRealizados);
		this.setCodicaoPaciente(codicaoPaciente);
		this.setExameRealizado(exameRealizado);
		this.setMedicamentos(medicamentos);
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public String getProcedimentosRealizados() {
		return procedimentosRealizados;
	}
	
	public void setProcedimentosRealizados(String procedimentosRealizados) {
		this.procedimentosRealizados = procedimentosRealizados;
	}
	
	public String getCodicaoPaciente() {
		return codicaoPaciente;
	}
	
	public void setCodicaoPaciente(String codicaoPaciente) {
		this.codicaoPaciente = codicaoPaciente;
	}
	
	public String getExameRealizado() {
		return exameRealizado;
	}
	
	public void setExameRealizado(String exameRealizado) {
		this.exameRealizado = exameRealizado;
	}
	
	public String getMedicamentos() {
		return medicamentos;
	}
	
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	
}
