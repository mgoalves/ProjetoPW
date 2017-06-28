package br.com.labpw.servletController;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.model.Usuario;
import br.com.labpw.model.UsuarioDao;

@SuppressWarnings("serial")
@WebServlet("/servletlogin")
public class ServletLogin extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// captura os parâmetros passados na requisição
		String usuarioStr = request.getParameter("usuario");
		String senhaStr = request.getParameter("senha");

		if ((usuarioStr == null || senhaStr == null) || (usuarioStr.isEmpty() || senhaStr.isEmpty())) {
			request.getRequestDispatcher("/index.html").forward(request, response);
		} else {
			// Recupera uma conexão com o banco
			Connection connection = new ConnectionFactory().getConnection();

			// Instancia um objeto Usuario e seta os valores recebidos na
			// requisiação
			Usuario usuario = new Usuario();
			usuario.setNome(usuarioStr);
			usuario.setSenha(senhaStr);

			// Instancia um UsuarioDao e executa o método de autenticar
			UsuarioDao dao = new UsuarioDao(connection);
			Usuario usuarioAutenticado = dao.autenticar(usuario);
			if (usuarioAutenticado != null) {
				HttpSession sessao = request.getSession();
				sessao.setAttribute("usuario", usuarioAutenticado);
				sessao.setMaxInactiveInterval(2 * 60);
				request.getRequestDispatcher("/home.jsp").forward(request, response);

			} else {
				request.setAttribute("menssagem", "Usuário e/ou senha inválidos!!!");
				request.getRequestDispatcher("/erroPage.jsp").forward(request, response);
				;
			}
		}

	}

}
