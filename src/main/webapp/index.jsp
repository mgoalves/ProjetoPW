<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <%@include file="includes/head.jsp"%>
        <link rel="stylesheet" href="css/styleLogin.css">
    </head>
    <body>
        <%@include file="includes/cabecalho.jsp"%>
        <br><br>
        <div class="container">
            <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <h1 class="text-center login-title">Informe Login e Senha para acessar o sistema</h1>
                <div class="account-wall">
                    <form class="form-signin" action="home.jsp">
                    <input type="text" class="form-control" placeholder="Email" autofocus><br>
                    <input type="password" class="form-control" placeholder="Password">
                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        Entrar</button>

                    </form>
                </div
            </div>
            </div>
        </div>
    </body>
</html>