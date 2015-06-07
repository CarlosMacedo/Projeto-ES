package prontuario.model;


public abstract class Sistema {
	private static Pessoa userLogado;

	public static Pessoa getUsuarioLogado() {
		return userLogado;
	}

	public static void setUsuarioLogado(Pessoa userLogado) {
			Sistema.userLogado = userLogado;
	}
	
}
