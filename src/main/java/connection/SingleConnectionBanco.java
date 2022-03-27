package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {

	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "123456";
	private static Connection connection = null;
	
	public static Connection getConnection() {
		return connection;
	}
	
	static { /*Para conex�o direta*/
		conectar();
	}

	public SingleConnectionBanco() { /*Quando tiver uma instancia vai conectar*/
		conectar();
	}
	
	private static void conectar() {

		try {

			if (connection == null) {
				Class.forName("org.postgresql.Driver");/*Carrega o driver de conex�o com o banco*/
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false);/*para n�o efetuar altera��es no banco sem nosso comando*/
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
