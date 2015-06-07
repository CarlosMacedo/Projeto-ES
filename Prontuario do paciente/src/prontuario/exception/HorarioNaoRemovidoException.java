package prontuario.exception;

@SuppressWarnings("serial")
public class HorarioNaoRemovidoException extends RuntimeException {

	public HorarioNaoRemovidoException(String valor) {
		super("O horário ("+ valor +") não existe. ");
	}
}
