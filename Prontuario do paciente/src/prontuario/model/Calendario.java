package prontuario.model;

public class Calendario {
	private String data;
	private int hora;
	
	public Calendario(String data, int hora) {
		setData(data);
		setHora(hora);
	}

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}

	
	
	
}
