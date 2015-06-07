package prontuario.model;

public class Consulta {
	private String horario;
	private String data;
	private String idPaciente;
	private String idMedico;
	
	public Consulta(String horario, String data, String paciente, String medico) {
		this.setHorario(horario);
		this.setData(data);
		this.setPaciente(paciente);
		this.setMedico(medico);
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPaciente() {
		return idPaciente;
	}

	public void setPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getMedico() {
		return idMedico;
	}

	public void setMedico(String idMedico) {
		this.idMedico = idMedico;
	}
	
}
