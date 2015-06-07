package prontuario.model;

public class Prontuario {
	private FormularioDeIdentificacao formIdentificacao;
	private FormularioDeInternacao formInternacao;
	private FormularioDeAnamnese formAnamnese;
	private FormularioDeExameFisico formExameFisico;
	private EvolucaoDaDoenca evolucaoDoenca;
	private BoletimDeAlta boletimAlta;
	
	
	
	public Prontuario(FormularioDeIdentificacao formIdentificacao,
			FormularioDeInternacao formInternacao,
			FormularioDeAnamnese formAnamnese,
			FormularioDeExameFisico formExameFisico,
			EvolucaoDaDoenca evolucaoDoenca, BoletimDeAlta boletimAlta) {
		this.setFormIdentificacao(formIdentificacao);
		this.setFormInternacao(formInternacao);
		this.setFormAnamnese(formAnamnese);
		this.setFormExameFisico(formExameFisico);
		this.setEvolucaoDoenca(evolucaoDoenca);
		this.setBoletimAlta(boletimAlta);
	}

	public FormularioDeIdentificacao getFormIdentificacao() {
		return formIdentificacao;
	}
	
	public void setFormIdentificacao(FormularioDeIdentificacao formIdentificacao) {
		this.formIdentificacao = formIdentificacao;
	}
	
	public FormularioDeInternacao getFormInternacao() {
		return formInternacao;
	}
	
	public void setFormInternacao(FormularioDeInternacao formInternacao) {
		this.formInternacao = formInternacao;
	}
	
	public FormularioDeAnamnese getFormAnamnese() {
		return formAnamnese;
	}
	
	public void setFormAnamnese(FormularioDeAnamnese formAnamnese) {
		this.formAnamnese = formAnamnese;
	}
	
	public FormularioDeExameFisico getFormExameFisico() {
		return formExameFisico;
	}
	
	public void setFormExameFisico(FormularioDeExameFisico formExameFisico) {
		this.formExameFisico = formExameFisico;
	}
	
	public EvolucaoDaDoenca getEvolucaoDoenca() {
		return evolucaoDoenca;
	}
	
	public void setEvolucaoDoenca(EvolucaoDaDoenca evolucaoDoenca) {
		this.evolucaoDoenca = evolucaoDoenca;
	}
	
	public BoletimDeAlta getBoletimAlta() {
		return boletimAlta;
	}
	
	public void setBoletimAlta(BoletimDeAlta boletimAlta) {
		this.boletimAlta = boletimAlta;
	}
	
	
	
}
