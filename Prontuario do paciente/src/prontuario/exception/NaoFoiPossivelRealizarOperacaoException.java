package prontuario.exception;

@SuppressWarnings("serial")
public class NaoFoiPossivelRealizarOperacaoException extends RuntimeException {
	public NaoFoiPossivelRealizarOperacaoException(){
		super("N�o foi possivel realizar a opera��o.");
	}
}
