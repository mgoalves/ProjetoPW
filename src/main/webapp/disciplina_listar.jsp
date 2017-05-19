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

            <!--############# FAIXA DE OPÇÕES #############-->
            <%@include file="includes/disciplina/disciplina_faixa_opcoes.jsp"%>
            <!--############# FAIXA DE OPÇÕES #############-->
            
            <!-- ############# Conteudo ############# -->
            <div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

                <!-- Div Conteudo -->
                <div class="conteudo">
                    <hr/>
                    <div class="panel panel-default">
                        <div class="panel-heading"> <center>Lista de Disciplinas</center> </div>
                            <div class="panel-body">

                                <table class="table table-hover">
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
                                        <td><a href="#">Editar</a></td>
                                        <td><a href="#">Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>20</td>
                                        <td>Matemática</td>
                                        <td>96</td>
                                        <td><a href="#">Editar</a></td>
                                        <td><a href="#">Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>30</td>
                                        <td>Geografia Política</td>
                                        <td>60</td>
                                        <td><a href="#">Editar</a></td>
                                        <td><a href="#">Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>40</td>
                                        <td>Inglês Técnico</td>
                                        <td>60</td>
                                        <td><a href="#">Editar</a></td>
                                        <td><a href="#">Excluir</a></td>
                                    </tr>
                                    <tr>
                                        <td>50</td>
                                        <td>Algorítimos</td>
                                        <td>100</td>
                                        <td><a href="#">Editar</a></td>
                                        <td><a href="#">Excluir</a></td>
                                    </tr>    
                                </table>
                           
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