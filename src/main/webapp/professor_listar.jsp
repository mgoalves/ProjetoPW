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
            <%@include file="includes/professor/professor-titulo-pagina.jsp"%>
            <!--############# FIM TÍTULO PÁGINA #############-->

            <!--############# FAIXA DE OPÇÕES #############-->
            <%@ include file="includes/professor/professor_faixa_opcoes_lista.jsp"%>
            <!--############# FAIXA DE OPÇÕES #############-->

            <!-- Div Conteudo -->
            <div class="conteudo">

                <!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->
                <%@include file="includes/confirmar_excluir.jsp"%>
                <!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->

                <div class="panel panel-default">
                    <div class="panel-heading"> 
                        <div class="panel-heading titulo-painel">
                            <h2><center>Lista de Professores</center></h2>
                        </div>
                    </div>
                    <div class="panel-body">

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <center><h6 class="hidden-lg hidden-md hidden-sm"> [Role a tabela lateralmente se necessário]<h6></center>
                                <tr>
                                    <th>Matrícula</th>
                                    <th>Nome</th>
                                    <th>Telefone</th>
                                    <th>Email</th>
                                    <th colspan="2">Ações</th>
                                </tr>
                                <tr>
                                    <td>10</td>
                                    <td>Professor 01</td>
                                    <td>(62)44444-4444</td>
                                    <td>professor01@nossaescola.com</td>
                                    <td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                    <td class="excluir-link"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                </tr>
                                <tr>
                                    <td>20</td>
                                    <td>Professor 02</td>
                                    <td>(62)33333-3333</td>
                                    <td>professor02@nossaescola.com</td>
                                    <td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                    <td class="excluir-link"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                </tr>
                                <tr>
                                    <td>30</td>
                                    <td>Professor 03</td>
                                    <td>(62)99999-9999</td>
                                    <td>professor03@nossaescola.com</td>
                                    <td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
                                    <td class="excluir-link"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
                                </tr>    
                            </table>
                        </div><!-- Tabela Responsiva -->

                    </div><!-- Painel corpo Conteudo -->
                </div><!-- Painel -->





                
            </div> <!-- FIM Div Conteudo -->
        </div> <!-- conteudo -->
        <!-- ############# FIM do conteudo ############# -->



    </div> <!-- Linha principal -->
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