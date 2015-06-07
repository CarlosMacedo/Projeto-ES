package prontuario.exception;

@SuppressWarnings("serial")
public class HorarioRepetidoException extends RuntimeException {

	public HorarioRepetidoException(String valor) {
		super("O horário ("+ valor +") já existente no sistema, por favor insira outro.");
	}
}

