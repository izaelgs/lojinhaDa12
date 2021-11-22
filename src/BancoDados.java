import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDados {
	
	public static void main(String[] args) throws SQLException{
		final String url = "jdbc:mysql://localhost";
		final String user = "root";
		final String senha = "senha";
		
		Connection conexao = DriverManager.getConnection(url, user, senha);
		System.out.println("Conexão efetuada com sucesso");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS lojinhada12");
		conexao.close();
	}	 
	
	public static boolean adicionarRegistro(Object objeto){
		System.out.println("registro adicionado");
		return true;
	}
}
