package br.com.labpw.servletController;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.model.Endereco;
import br.com.labpw.model.aluno.Aluno;
import br.com.labpw.model.aluno.AlunoDao;
import br.com.labpw.model.aluno.LogicaAluno;

@WebServlet("/servletaluno")
public class ServletAluno extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String classe ="br.com.labpw.model.aluno."+ request.getParameter("logica");
			
		try{
			LogicaAluno logicaAluno = (LogicaAluno)Class.forName(classe).newInstance();
			String pagina = logicaAluno.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
			
		}catch(Exception e){
			response.getWriter().println("Erro ao executar lógica da aplicação: " + e);
		}
	}
}
