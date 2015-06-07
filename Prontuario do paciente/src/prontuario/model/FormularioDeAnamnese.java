package prontuario.model;

public class FormularioDeAnamnese {
	private String informante;
	private String queixaPrincipal;
	private String historiaDaDoencaAtual;
	private String interrogatorio;
	private String sistemaCardiovascular;
	private String sistemaDigestorio;
	private String aparelhoGeniturinario;
	private String sistemaTegumentar;
	private String sistemaNervoso;
	private String sistemaMuscularEsqueletico;
	private String sistemaArticular;
	private String aparelhoVisual;
	private String aparelhoAuditivo;
	private String tratamentosAnteriores;
	private String antecendentesPessoais;
	private String antecendentesFamiliares;
	private boolean tabagismo;
	
	public FormularioDeAnamnese(String informante, String queixaPrincipal, String historiaDaDoencaAtual,
			String interrogatorio, String sistemaCardiovascular, String sistemaDigestorio, 
			String aparelhoGeniturinario, String sistemaTegumentar, String sistemaNervoso,
			String sistemaMuscularEsqueletico, String sistemaArticular, String aparelhoVisual,
			String aparelhoAuditivo, String tratamentosAnteriores, String antecendentesPessoais,
			String antecendentesFamiliares, boolean tabagismo){
		this.setInformante(informante);
		this.setQueixaPrincipal(queixaPrincipal);
		this.setHistoriaDaDoencaAtual(historiaDaDoencaAtual);
		this.setInterrogatorio(interrogatorio);
		this.setSistemaCardiovascular(sistemaCardiovascular);
		this.setSistemaDigestorio(sistemaDigestorio);
		this.setAparelhoGeniturinario(aparelhoGeniturinario);
		this.setSistemaTegumentar(sistemaTegumentar);
		this.setSistemaNervoso(sistemaNervoso);
		this.setSistemaMuscularEsqueletico(sistemaMuscularEsqueletico);
		this.setSistemaArticular(sistemaArticular);
		this.setAparelhoVisual(aparelhoVisual);
		this.setAparelhoAuditivo(aparelhoAuditivo);
		this.setTratamentosAnteriores(tratamentosAnteriores);
		this.setAntecendentesFamiliares(antecendentesFamiliares);
		this.setAntecendentesPessoais(antecendentesPessoais);
		this.setTabagismo(tabagismo);
	}
	
	public String getInformante() {
		return informante;
	}
	
	public void setInformante(String informante) {
		this.informante = informante;
	}
	
	public String getQueixaPrincipal() {
		return queixaPrincipal;
	}
	
	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}
	
	public String getHistoriaDaDoencaAtual() {
		return historiaDaDoencaAtual;
	}
	
	public void setHistoriaDaDoencaAtual(String historiaDaDoencaAtual) {
		this.historiaDaDoencaAtual = historiaDaDoencaAtual;
	}
	
	public String getInterrogatorio() {
		return interrogatorio;
	}
	
	public void setInterrogatorio(String interrogatorio) {
		this.interrogatorio = interrogatorio;
	}
	
	public String getSistemaCardiovascular() {
		return sistemaCardiovascular;
	}
	
	public void setSistemaCardiovascular(String sistemaCardiovascular) {
		this.sistemaCardiovascular = sistemaCardiovascular;
	}
	
	public String getSistemaDigestorio() {
		return sistemaDigestorio;
	}
	
	public void setSistemaDigestorio(String sistemaDigestorio) {
		this.sistemaDigestorio = sistemaDigestorio;
	}
	
	public String getAparelhoGeniturinario() {
		return aparelhoGeniturinario;
	}
	
	public void setAparelhoGeniturinario(String aparelhoGeniturinario) {
		this.aparelhoGeniturinario = aparelhoGeniturinario;
	}
	
	public String getSistemaTegumentar() {
		return sistemaTegumentar;
	}
	
	public void setSistemaTegumentar(String sistemaTegumentar) {
		this.sistemaTegumentar = sistemaTegumentar;
	}
	
	public String getSistemaNervoso() {
		return sistemaNervoso;
	}
	
	public void setSistemaNervoso(String sistemaNervoso) {
		this.sistemaNervoso = sistemaNervoso;
	}
	
	public String getSistemaMuscularEsqueletico() {
		return sistemaMuscularEsqueletico;
	}
	
	public void setSistemaMuscularEsqueletico(String sistemaMuscularEsqueletico) {
		this.sistemaMuscularEsqueletico = sistemaMuscularEsqueletico;
	}
	
	public String getSistemaArticular() {
		return sistemaArticular;
	}
	
	public void setSistemaArticular(String sistemaArticular) {
		this.sistemaArticular = sistemaArticular;
	}
	
	public String getAparelhoVisual() {
		return aparelhoVisual;
	}
	
	public void setAparelhoVisual(String aparelhoVisual) {
		this.aparelhoVisual = aparelhoVisual;
	}
	
	public String getAparelhoAuditivo() {
		return aparelhoAuditivo;
	}
	
	public void setAparelhoAuditivo(String aparelhoAuditivo) {
		this.aparelhoAuditivo = aparelhoAuditivo;
	}
	
	public String getTratamentosAnteriores() {
		return tratamentosAnteriores;
	}
	
	public void setTratamentosAnteriores(String tratamentosAnteriores) {
		this.tratamentosAnteriores = tratamentosAnteriores;
	}
	
	public String getAntecendentesPessoais() {
		return antecendentesPessoais;
	}
	
	public void setAntecendentesPessoais(String antecendentesPessoais) {
		this.antecendentesPessoais = antecendentesPessoais;
	}
	
	public String getAntecendentesFamiliares() {
		return antecendentesFamiliares;
	}
	
	public void setAntecendentesFamiliares(String antecendentesFamiliares) {
		this.antecendentesFamiliares = antecendentesFamiliares;
	}
	
	public boolean isTabagismo() {
		return tabagismo;
	}
	
	public void setTabagismo(boolean tabagismo) {
		this.tabagismo = tabagismo;
	}
	
	
}
