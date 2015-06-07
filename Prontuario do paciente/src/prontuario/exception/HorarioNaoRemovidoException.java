package prontuario.exception;

@SuppressWarnings("serial")
public class HorarioNaoRemovidoException extends RuntimeException {

	public HorarioNaoRemovidoException(String valor) {
		super("O hor�rio ("+ valor +") n�o existe. ");
	}
}
