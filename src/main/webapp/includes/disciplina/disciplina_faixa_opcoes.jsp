<%@page contentType="text/html; charset=UTF-8"%>

<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12 pesquisaBotoes">

    <!-- Pesquisar -->
    <div class="row pesquisar">
        <form>
            <div class="form-group">
                <div class="col-lg-9 col-md-9 col-sm-8 col-xs-10">
                    <input type="text" class="form-control" id="pesquisar"
                        placeholder="Nome ou Matrícula">
                </div>
            </div>
            <button type="submit"
                class="col-lg-2 col-md-2 col-sm-3 col-xs-1 hidden-xs btn btn-primary">Pesquisar</button>
            <button type="submit"
                class="col-xs-1 hidden-lg hidden-md hidden-sm btn btn-primary botao-buscar-mobile">
                <span class="glyphicon glyphicon-search"></span>
            </button>
        </form>
    </div>
    <!-- Pesquisar -->

    <!-- Botões de opções -->
    <div id="opcoes" class="row botoes">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <a
                class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary"
                href="disciplina_cadastrar.jsp" role="button">Cadastrar</a> <a
                class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary"
                href="disciplina_editar" role="button">Editar</a> <a
                class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary"
                href="disciplina_excluir" role="button">Excluir</a> <a
                class="col-lg-2 col-md-2 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary"
                href="disciplina_listar.jsp" role="button">Listar</a>
        </div>
    </div>
    <!-- Botões de opções -->

</div>