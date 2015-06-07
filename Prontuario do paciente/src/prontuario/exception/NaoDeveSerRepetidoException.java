package prontuario.exception;

@SuppressWarnings("serial")
public class NaoDeveSerRepetidoException extends RuntimeException{
	public NaoDeveSerRepetidoException(String valor) {
		super("O ("+ valor +") j� existente no sistema, por favor insira outro.");
	}
}
