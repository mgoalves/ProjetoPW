/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-18 02:40:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/menuLateral.jsp", Long.valueOf(1495051498514L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<title>Gestor Acadêmico</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Meu estilo -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Fontes a serem utilizadas -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Open+Sans|Roboto:400,500,900|Source+Sans+Pro:700\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Javascript e jQuery -->\r\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src='js/bootstrap.min.js' type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\" role=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--############# Linha Cabeçalho #############-->\r\n");
      out.write("\t\t\t<div class=\"row titulo\">\r\n");
      out.write("\t\t\t\t<h1>Gestor Acadêmico</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- ############# FIM do Cabeçalho #############-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ############# Linha principal ############# -->\r\n");
      out.write("\t\t\t<div class=\"row margem-top-15px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Menu Lateral -->\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default menu-lateral\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand hidden-lg hidden-md hidden-sm\" href=\"#\">MENU</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav menu-lateral-mobile\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- HOME -->\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\"> <!-- Esse menu so parece para celular -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu_32/home_32px.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Home\"> <span>home</span>\r\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\r\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu/home.jpg\" alt=\"Menu Botï¿½o Home\">\r\n");
      out.write("\t\t\t\t\t\t\t<figcaption>home</figcaption>\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<!-- HOME -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- ALUNOS -->\r\n");
      out.write("\t\t\t\t<li><a href=\"alunos.jsp\"> <!-- Esse menu so parece para celular -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu_32/aluno_32px.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Alunos\"> <span>alunos</span>\r\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\r\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu/aluno.jpg\" alt=\"Menu Botï¿½o Alunos\">\r\n");
      out.write("\t\t\t\t\t\t\t<figcaption>alunos</figcaption>\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<!-- ALUNOS -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- PROFESSORES -->\r\n");
      out.write("\t\t\t\t<li><a href=\"professores.jsp\"> <!-- Esse menu so parece para celular -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu_32/professor_32px.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Professores\"> <span>professores</span>\r\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\r\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu/professor.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Professores\">\r\n");
      out.write("\t\t\t\t\t\t\t<figcaption>professores</figcaption>\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<!-- PROFESSORES -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- DISCIPLINA -->\r\n");
      out.write("\t\t\t\t<li><a href=\"disciplinas.jsp\"> <!-- Esse menu so parece para celular -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu_32/disciplina_32px.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Disciplina\"> <span>disciplina</span>\r\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\r\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"imagens/icones_menu/disciplina.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Disciplina\">\r\n");
      out.write("\t\t\t\t\t\t\t<figcaption>disciplina</figcaption>\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<!-- DISCIPLINA -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- nav-collapse -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- navbar-default -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Menu Lateral -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- ############# Conteudo ############# -->\r\n");
      out.write("\t\t\t\t<div id=\"conteudo\" class=\"col-lg-10 col-md-9 col-sm-8 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<h1>Bem vindo!</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- conteudo -->\r\n");
      out.write("\t\t\t\t<!-- ############# FIM do conteudo ############# -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<footer>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 rodape\">\r\n");
      out.write("\t\t\t\t\t\t<p>Sistema de Gestão de alunos - 2017</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- rodape -->\r\n");
      out.write("\t\t\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Linha principal -->\r\n");
      out.write("\t\t\t<!-- ############# FIM da Linha principal ############# -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- div container -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- div wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}