package br.com.labpw.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.model.Usuario;

@WebFilter("*.jsp")
public class FiltroAcessoJSP implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub	
	}
	
	private void dispatcher(HttpServletRequest request, HttpServletResponse response, String mensagem) throws ServletException, IOException{
		((HttpServletRequest) request).setAttribute("erro", mensagem);
		((HttpServletRequest) request).setAttribute("nextPage", "index.html");
		((HttpServletRequest)request).setAttribute("messageLink", "Autenticar-se");
		((HttpServletRequest) request).getRequestDispatcher("/erroPage.jsp").forward(request, response);
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Usuario usuario = (Usuario)((HttpServletRequest) request).getSession().getAttribute("usuario");
		

		if(usuario == null){
			this.dispatcher((HttpServletRequest) request, (HttpServletResponse)response, "Sessão inválida");
			
		}else {
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub	
	}
}
