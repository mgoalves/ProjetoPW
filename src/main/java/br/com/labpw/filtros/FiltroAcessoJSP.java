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
		((HttpServletRequest) request).setAttribute("menssagem", "Sessão inválida");
		((HttpServletRequest) request).getRequestDispatcher("/erroPage.jsp").forward(request, response);
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Usuario usuario = (Usuario)((HttpServletRequest) request).getAttribute("usuario");
		Boolean isLogado = (Boolean)((HttpServletRequest) request).getSession().getAttribute("logado");
		
		if(isLogado == null){
			
			this.dispatcher((HttpServletRequest) request, (HttpServletResponse)response, "Sessão inválida");
			
		}else if(isLogado){
			
			chain.doFilter(request, response);
			
		}else{
			
			this.dispatcher((HttpServletRequest) request, (HttpServletResponse)response, "Sessão inválida");
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub	
	}
}
