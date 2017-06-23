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

@WebFilter("*.html")
public class FiltroLogin implements Filter {
	
	public void destroy() {
		// TODO Auto-generated method stub	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Boolean isLogado = (Boolean)((HttpServletRequest) request).getSession().getAttribute("logado");
		
		if(isLogado != null){
			if(isLogado){
				request.getRequestDispatcher("/home.jsp").forward(request, response);
			}else {
				chain.doFilter(request, response);
			}
		}else {
			chain.doFilter(request, response);
		}
	}
	
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub	
	}

}
