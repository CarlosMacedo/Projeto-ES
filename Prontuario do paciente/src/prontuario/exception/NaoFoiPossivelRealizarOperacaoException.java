package prontuario.exception;

@SuppressWarnings("serial")
public class NaoFoiPossivelRealizarOperacaoException extends RuntimeException {
	public NaoFoiPossivelRealizarOperacaoException(){
		super("Não foi possivel realizar a operação.");
	}
}
