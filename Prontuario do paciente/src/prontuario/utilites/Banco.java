package prontuario.utilites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Banco {
	public Statement stm;
	public ResultSet rs;
	private String driver = "org.postgresql.Driver";
	private String caminho = "jdbc:postgresql://localhost:5432/prontuario_paciente1";
	private String usuario = "postgres";
	private String senha = "123";
	public Connection conn;
	
	public void conexao(){
		try {
			System.setProperty("jdbc.Drivers", driver); 
			conn = DriverManager.getConnection(caminho, usuario, senha);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro de conexão! "+ ex.getMessage());
		}
	}
	
	@SuppressWarnings("static-access")
	public void executaConsultas(String sql){
		try {
			stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
			rs = stm.executeQuery(sql);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro no executa SQL! "+ ex.getMessage());
		}
	}
	
	public void desconecta(){
		try {
			conn.close();
		} catch (SQLException ex){
			JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" + ex.getMessage());
		}
	}
	
	/*Para comandos SQL sem retorno*/
	public void executar(String sql) throws SQLException {
		Banco banco = new Banco();
		banco.conexao();

		PreparedStatement pst = banco.conn.prepareStatement(sql);
		pst.executeUpdate();
		
	}
}
