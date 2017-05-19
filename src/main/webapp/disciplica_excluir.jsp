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
                <div class="conteudo">Disciplina exclusão</div>
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