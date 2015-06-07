package prontuario.exception;

@SuppressWarnings("serial")
public class NaoDeveSerRepetidoException extends RuntimeException{
	public NaoDeveSerRepetidoException(String valor) {
		super("O ("+ valor +") já existente no sistema, por favor insira outro.");
	}
}
