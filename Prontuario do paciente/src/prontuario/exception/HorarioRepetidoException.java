package prontuario.exception;

@SuppressWarnings("serial")
public class HorarioRepetidoException extends RuntimeException {

	public HorarioRepetidoException(String valor) {
		super("O hor�rio ("+ valor +") j� existente no sistema, por favor insira outro.");
	}
}

