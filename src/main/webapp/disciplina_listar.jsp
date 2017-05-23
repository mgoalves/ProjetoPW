<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <%@include file="includes/head.jsp"%>
</head>

<body>

    <div class="wrapper" role="main">

        <div class="container-fluid">

          <!--############# Linha Cabeçalho #############-->
          <%@include file="includes/cabecalho.jsp"%>
          <!-- ############# FIM do Cabeçalho #############-->

          <!-- ############# Linha principal ############# -->
          <div class="row margem-top-15px">

            <!-- Menu Lateral -->
            <div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
                <%@include file="menuLateral.jsp"%>
            </div>
            <!-- Menu Lateral -->

            
            <!-- ############# Conteudo ############# -->
            <div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

                <!--############# TÍTULO PÁGINA #############-->
                <%@include file="includes/disciplina/disciplina-titulo-pagina.jsp"%>
                <!--############# FIM TÍTULO PÁGINA #############-->


                <!--############# FAIXA DE OPÇÕES #############-->
                <%@ include file="includes/disciplina/disciplina_faixa_opcoes_listar.jsp"%>
                <!--############# FAIXA DE OPÇÕES #############-->

                <!-- Div Conteudo -->
                <div class="conteudo">
                    <br/><br/><br/>
                    <div class="panel panel-default">
                        <div class="panel-heading titulo-painel">
                            <h2><center>Lista de Disciplinas</center></h2>
                        </div>
                        <div class="panel-body">

                            <div class="table-responsive">
                                <table class="table table-houve">
                                <center><h6 class="hidden-lg hidden-md hidden-sm">[Role a tabela lateralmente se necessário]<h6></center>
                                    <tr>
                                        <th>Código</th>
                                        <th>Nome</th>
                                        <th>Duração</th>
                                        <th colspan="2">Ações</th>
                                    </tr>
                                    <tr>
                                        <td>10</td>
                                        <td>Língua Portuguesa</td>
                                        <td>96</td>
                                        <td class="editar-link"><a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                        <td class="excluir-link"><a href="#"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>20</td>
                                        <td>Matemática</td>
                                        <td>96</td>
                                        <td class="editar-link"><a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                        <td class="excluir-link"><a href="#"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>30</td>
                                        <td>Geografia Política</td>
                                        <td>60</td>
                                        <td class="editar-link"><a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                        <td class="excluir-link"><a href="#"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>40</td>
                                        <td>Inglês Técnico</td>
                                        <td>60</td>
                                        <td class="editar-link"><a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                        <td class="excluir-link"><a href="#"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>50</td>
                                        <td>Algorítimos</td>
                                        <td>100</td>
                                        <td class="editar-link"><a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                        <td class="excluir-link"><a href="#"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                    </tr>    
                                </table>
                            </div><!-- Tabela Responsiva -->

                        </div><!-- Painel corpo Conteudo -->
                    </div><!-- Painel -->

                </div>
                <!-- FIM Div Conteudo -->


            </div>
            <!-- conteudo -->
            <!-- ############# FIM do conteudo ############# -->



        </div>
        <!-- Linha principal -->
        <!-- ############# FIM da Linha principal ############# -->

        <!-- Linha rodape -->

        <!-- ############# INÍCIO DO RODAPÉ ############# -->
        <%@ include file="includes/rodape.jsp"%>
        <!-- ############# FIM DO RODAPÉ ############# -->

    </div>
    <!-- div container -->
</div>
<!-- div wrapper -->


</body>
</html>