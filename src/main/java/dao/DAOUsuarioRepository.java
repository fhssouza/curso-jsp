package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOUsuarioRepository {

	private Connection connection;

	public DAOUsuarioRepository() {
		connection = SingleConnectionBanco.getConnection();
	}

	public ModelLogin salvarUsuario(ModelLogin modelLogin) throws Exception {

		String salvar = "INSERT INTO public.model_login(login, senha, nome, email) VALUES (?, ?, ?, ?)";

		PreparedStatement insert = connection.prepareStatement(salvar);

		insert.setString(1, modelLogin.getLogin());
		insert.setString(2, modelLogin.getSenha());
		insert.setString(3, modelLogin.getNome());
		insert.setString(4, modelLogin.getEmail());
		insert.execute();

		connection.commit();
		
		return this.consultarUsuario(modelLogin.getLogin());
	}
	
	public ModelLogin consultarUsuario(String login) throws Exception {

		ModelLogin modelLogin = new ModelLogin();
		
		String sql = "SELECT * FROM model_login WHERE upper(login) = upper('"+login+"')";
		
		PreparedStatement consultar = connection.prepareStatement(sql);
				
		ResultSet resultado = consultar.executeQuery();
		
		
		while (resultado.next()) {
			modelLogin.setId(resultado.getLong("id"));
			modelLogin.setEmail(resultado.getString("email"));
			modelLogin.setLogin(resultado.getString("senha"));
			modelLogin.setSenha(resultado.getString("senha"));
			modelLogin.setNome(resultado.getString("nome"));
		}
		
		return modelLogin;
	}
	
	public boolean validarLogin(String login) throws Exception{
		String sql = "SELECT count(1) > 0 as existe FROM model_login WHERE upper(login) = upper('"+login+"')";
		
		PreparedStatement consultar = connection.prepareStatement(sql);
		
		ResultSet resultado = consultar.executeQuery();
		
		resultado.next();
		return resultado.getBoolean("existe");
	}
}
