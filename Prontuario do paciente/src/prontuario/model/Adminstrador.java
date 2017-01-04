/**
 * Copyright 2017 Carlos Macêdo
 * 
 * This file is part of SeT software.
 * 
 *  SeT is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU General 
 *  Public License as published by the Free Software Foundation, either 
 *  version 3 of the License, or (at your option) any later version.
 *  
 *  SeT is distributed in the hope that
 *  it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 *  the GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with SeT
 *  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  Contact: carlosmacedo025 at gmail dot com
 */
package prontuario.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import prontuario.utilites.Banco;

public class Adminstrador extends Pessoa implements FuncionalidadesExtras {

	private static Adminstrador adm;

	

	private Adminstrador(String login, String senha) throws SQLException {
		super(login, senha);
		// TODO Auto-generated constructor stub
	}

	//Apenas um adm
	public static synchronized Adminstrador getInstance(){		
		if ( adm == null ) {
			Banco banco = new Banco();
			banco.conexao();
			banco.executaConsultas("SELECT * FROM adm LIMIT 1");
			
			try {
				banco.rs.first();
				adm = new Adminstrador(banco.rs.getString("login"), banco.rs.getString("senha"));
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Não foi possivel encontrar a identificação do Administrador: "+
						e.getMessage());
			}
		}
		
		return adm;
	}
	
	@Override
	public void visualizarDadosEstatisticos() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	public void cadastrarPaciente(Paciente paciente) throws SQLException{
		Banco banco = new Banco();
		banco.conexao();
		
		
			PreparedStatement pst = banco.conn.prepareStatement("INSERT INTO paciente(login, senha, nome,"
						+ " telefone, cpf, email, sexo, dia_nascimento, mes_nascimento, ano_nascimento, "
						+ " num_rg, dia_rg, mes_rg, ano_rg, uf_rg, orgao_rg) "
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, paciente.getLogin() );
			pst.setString(2, paciente.getSenha() );
			pst.setString(3, paciente.getNome() );
			pst.setString(4, paciente.getTelefone() );
			pst.setString(5, paciente.getCpf() );
			pst.setString(6, paciente.getEmail() );
			pst.setString(7, paciente.getSexo() );
			pst.setInt(8, paciente.getData().getDate() );
			pst.setInt(9, paciente.getData().getMonth() );
			pst.setInt(10, paciente.getData().getYear() );
			pst.setString(11, paciente.getRg().getNum() );
			pst.setInt(12, 1 );
			pst.setInt(13, 1 );
			pst.setInt(14, 1 );
			pst.setString(15, paciente.getRg().getUf() );
			pst.setString(16, paciente.getRg().getOrgao() );
			

    	
			pst.executeUpdate();			
		
	}
	
	@SuppressWarnings("deprecation")
	public void cadastrarMedico(Medico medico) throws SQLException{
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executar("INSERT INTO medico(login, senha, nome,"
										+ " telefone, cpf, email, sexo,"
										+ " dia_nascimento, mes_nascimento, ano_nascimento,"
										+ " uf_end, cidade_end, rua_end, bairro_end, "
										+ "complemento_end, num_end, cep_end, num_rg,"
										+ " dia_rg, mes_rg, ano_rg, uf_rg, orgao_rg,"
										+ " crm, especialidade)"
					+ " VALUES ('"+ medico.getLogin() +"', '"+ medico.getSenha() +"', '"+ medico.getNome() +"',"
							+ " '"+ medico.getTelefone() +"', '"+ medico.getCpf() +"', '"+ medico.getEmail() +"', '"+ medico.getSexo() +"',"
							+ " '"+ medico.getData().getDate() +"', '"+ medico.getData().getMonth() +"', '"+ medico.getData().getYear() +"',"
							+ " '"+ medico.getEndereco().getUf() +"', '"+ medico.getEndereco().getCidade() +"', '"+ medico.getEndereco().getRua() +"', '"+ medico.getEndereco().getBairro() +"',"
							+ " '"+ medico.getEndereco().getComplemento() +"', '"+ medico.getEndereco().getNumero() +"', '"+ medico.getEndereco().getCep() +"', '"+ medico.getRg().getNum() +"',"
							+ " '"+ 1 +"', '"+ 1 +"', '"+ 1 +"', '"
							+ medico.getRg().getUf() +"', '"+ medico.getRg().getOrgao() +"',"
							+ " '"+ medico.getCrm() +"', '"+ medico.getEspecialidade() +"')");
	}
	
	@SuppressWarnings("deprecation")
	public void cadastrarConvenio(Convenio convenio) throws SQLException{
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executar("INSERT INTO convenio("+
	            "cnpj, razao_social, nome, registro_ans, url, codigo_prestador, "+
	           " qnt_dias_retorno, dia_faturamento, mes_faturamento, ano_faturamento)"+
	    "VALUES ('"+ convenio.getCnpj() +"', '"+ convenio.getRazaoSocial()
	    		+"', '"+ convenio.getNomeFantasia() +"', '"+ convenio.getRegistroAns() +"', '"+ convenio.getUrl() +"', '"+ convenio.getCodigoPrestador() +"', "+
	            "'"+ convenio.getQuantidadeDeDiasRetorno() +"', '"+ convenio.getDataDoFaturamento().getDay() +"', '"+ convenio.getDataDoFaturamento().getMonth() +"', '"+ convenio.getDataDoFaturamento().getYear() +"')");
	}
	
	public void excluirUsuario(Usuario user){
		
	}
	
	public void excluirMedico(Medico medico){
		
	}
	
	public void excluirConvenio(Convenio convenio) throws SQLException{
		Banco banco = new Banco();
		banco.conexao();
		
		banco.executar("DELETE FROM convenio "
				+ "WHERE cnpj = '"+ convenio.getCnpj() +"'");
	}	
	
}
