package prontuario.model;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;

import prontuario.utilites.Banco;

public class Paciente extends Usuario{
	private Prontuario prontuario;
	private ArrayList<Queixas> queixa;
	private Convenio convenio;
	
	public Paciente(String login, String senha, String nome, String telefone, Endereco endereco, String cpf, 
			Rg rg, String email, String sexo, Date data) throws SQLException {
		super(login, senha, nome, telefone, endereco, cpf, rg, email, sexo, data);
		queixa = new ArrayList<Queixas>();
		prontuario = new Prontuario(new FormularioDeIdentificacao(0, null, null, null, null, null, null), 
				new FormularioDeInternacao(null, null, null, null), 
				new FormularioDeAnamnese(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true), 
				new FormularioDeExameFisico(), 
				new EvolucaoDaDoenca(null, null, null),
				new BoletimDeAlta(null, null, null, null, null, null));
		convenio = new Convenio(null, null, null, null, null, null, null, 0);
	}
	
	public void autoCadastro(){
		
	}
	
	public void editarPerfil(){
		
	}
	
	@SuppressWarnings("deprecation")
	public void addQueixa(Queixas queixa) throws SQLException{
		Banco b = new Banco();
		b.conexao();
		
		b.executar(MessageFormat
				.format("INSERT INTO queixa (dia, mes, ano,queixa, motivo, login_pacientefk) VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'', ''{4}'', ''{5}'')",
						queixa.getDataDeEnvio().getDate(), queixa.getDataDeEnvio().getMonth(), queixa.getDataDeEnvio().getYear(), queixa.getQueixa(), queixa.getMotivo(),
						this.getLogin()));
	}
	
	public void agendarConsultas(String loginMedico, String data, String horaInicio) throws SQLException{
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executar("INSERT INTO agendar_consulta_paciente("
				+ "login_medicofk, login_pacientefk, data_consulta, hora_inicio_consulta) "
				+ "VALUES ('"+ loginMedico +"', '"+ this.getLogin() +"', '"+ data +"', '"+ horaInicio +"')");
	}
	
	public void desmarcarConsultas(){
		
	}
	
	public void visualizarProntuario(){
		
	}
	
	public void visualizarLembrete(){
		
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	public ArrayList<Queixas> getQueixa() {
		return queixa;
	}
	
	public void setQueixa(ArrayList<Queixas> queixa) {
		this.queixa = queixa;
	}
	
	public Convenio getConvenio() {
		return convenio;
	}
	
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	@Override
	public void removerConsulta(Consulta c) throws SQLException {
		Banco banco = new Banco();
    	banco.conexao();
    	
		banco.executar("DELETE FROM agendar_consulta_paciente "
				+ "WHERE login_pacientefk = '"+ this.getLogin() +"' AND "
						+ "data_consulta = '"+ c.getData() +"' AND hora_inicio_consulta = '"+ c.getHorario() +"'");
		
	}
	
	
}
