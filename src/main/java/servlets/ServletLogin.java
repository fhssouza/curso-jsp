package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("Login");
		String senha = request.getParameter("Senha");

		ModelLogin modellogin = new ModelLogin();
		modellogin.setLogin(login);
		modellogin.setSenha(senha);

		if (modellogin.getLogin().equalsIgnoreCase("admin") && modellogin.getSenha().equalsIgnoreCase("admin")) {

			request.getSession().setAttribute("usuario", modellogin.getLogin());
			RequestDispatcher redirecionar = request.getRequestDispatcher("principal/principal.jsp");
			redirecionar.forward(request, response);

		} else {

			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "informe o login e senha corretamente");
			redirecionar.forward(request, response);

		}

	}

}
