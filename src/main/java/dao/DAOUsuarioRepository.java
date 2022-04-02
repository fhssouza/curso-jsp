package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOUsuarioRepository {

	private Connection connection;

	public DAOUsuarioRepository() {
		connection = SingleConnectionBanco.getConnection();
	}

	public void salvarUsuario(ModelLogin modelLogin) throws Exception {

		String salvar = "INSERT INTO public.model_login(login, senha, nome, email) VALUES (?, ?, ?, ?)";

		PreparedStatement insert = connection.prepareStatement(salvar);

		insert.setString(1, modelLogin.getLogin());
		insert.setString(2, modelLogin.getSenha());
		insert.setString(3, modelLogin.getNome());
		insert.setString(4, modelLogin.getEmail());
		insert.execute();

		connection.commit();
	}
}
