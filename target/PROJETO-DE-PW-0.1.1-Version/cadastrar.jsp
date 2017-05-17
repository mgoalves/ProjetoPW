<%@ page contentType="text/html; charset=UTF-8" %><!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Gestão de Alunos</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Meu estilo -->
    <link rel="stylesheet" href="css/estilo.css">

    <!-- Fontes a serem utilizadas -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto:400,500,900|Source+Sans+Pro:700" rel="stylesheet">

    <!-- Javascript e jQuery -->
    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src='js/bootstrap.min.js' type="text/javascript"></script>

</head>

<body>

    <div class="wrapper" role="main">

        <div class="container-fluid">

            <!--############# Linha Cabeçalho #############-->
            <div class="row titulo">
                <h1>Gestão de Alunos</h1>
            </div>
            <!-- ############# FIM do Cabeçalho #############-->

            <!-- ############# Linha principal ############# -->
            <div class="row margem-top-15px">

                <!-- Menu Lateral -->
                <div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
                    <%@include file = "menuLateral.jsp"%>
                </div><!-- Menu Lateral -->

                <!-- Pesquisar e Botões de opções -->
                <div class="col-lg-10 col-md-9 col-sm-8 col-xs-12 pesquisaBotoes">

                    <!-- Pesquisar -->
                    <div class="row pesquisar">
                        <form >
                            <div class="form-group">
                                <div class="col-lg-9 col-md-9 col-sm-8 col-xs-10">
                                    <input type="text" class="form-control" id="pesquisar" placeholder="Nome ou Matrícula">
                                </div>
                            </div>
                            <button type="submit" class="col-lg-2 col-md-2 col-sm-3 col-xs-1 hidden-xs btn btn-primary">Pesquisar</button>
                            <button type="submit" class="col-xs-1 hidden-lg hidden-md hidden-sm btn btn-primary botao-buscar-mobile"><span class="glyphicon glyphicon-search"></span></button>
                        </form>
                    </div><!-- Pesquisar -->

                    <!-- Botões de opções -->
                    <div id="opcoes" class="row botoes">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <a class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary" href="cadastrar.jsp" role="button">Cadastrar</a>
                            <a class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary" href="editar.jsp" role="button">Editar</a>
                            <a class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary" href="excluir.jsp" role="button">Excluir</a>
                            <a class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary" href="historico.jsp" role="button">Histórico</a>
                        </div>
                    </div><!-- Botões de opções -->

                </div><!-- Pesquisar e Botões de opções -->

                <!-- ############# Conteudo ############# -->
                <div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

                    <!-- Div Conteudo -->
                    <div class="conteudo">
                      <form class="form-horizontal">

                          <div class="form-group">
                              <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Matrícula</label>
                              <div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
                                <input type="text" class="form-control" id="cadastrarMatricula" placeholder="Matrícula">
                            </div>
                        </div>

                        <div class="form-group">
                          <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Nome</label>
                          <div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
                            <input type="text" class="form-control" id="cadastrarNome" placeholder="Nome">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Nascimento</label>
                        <div class="col-lg-3 col-md-3 col-sm-5 col-xs-12">
                          <input class="form-control" type="date" value="aaaa-mm-dd" id="example-date-input">
                      </div>
                  </div>

                  <div class="form-group">
                      <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">RG</label>
                      <div class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
                        <input type="text" class="form-control" id="cadastrarNome" placeholder="RG">
                    </div>
                </div>

                <div class="form-group">
                  <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Cidade</label>
                  <div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
                    <input type="text" class="form-control" id="cadastrarNome" placeholder="Cidade">
                </div>
            </div>

            <div class="form-group">
                <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Bairro</label>
                <div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
                    <input type="text" class="form-control" id="cadastrarNome" placeholder="Bairro">
                </div>
            </div>

            <div class="form-group">
                <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Logadouro</label>
                <div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
                    <input type="text" class="form-control" id="cadastrarNome" placeholder="Logadouro">
                </div>
            </div>


            <div class="form-group">
                <label class="col-lg-1 col-md-2 col-sm-3 col-xs-1 control-label">Logadouro</label>
                <div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
                    <input type="text" class="form-control" id="cadastrarNome" placeholder="Logadouro">
                </div>
            </div>

        </form>

    </div> <!-- FIM Div Conteudo -->


</div><!-- conteudo -->
<!-- ############# FIM do conteudo ############# -->



</div><!-- Linha principal -->
<!-- ############# FIM da Linha principal ############# -->

<!-- Linha rodape -->
<footer>
    <div class="row">
      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 rodape">
        <p>Sistema de Gestão de alunos - 2017</p>
    </div><!-- rodape -->
</div>
</footer>
<!-- FIM Linha rodape -->

</div><!-- div container -->
</div><!-- div wrapper -->


</body>
</html>