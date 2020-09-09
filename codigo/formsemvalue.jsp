
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FORM</h1>
        <form action="${linkTo[PessoasController].salvar}" method="post">
            <input type="hidden" name="pessoa.id">
            <input type="text" name="pessoa.nome"  placeholder="Nome">
            <input type="text" name="pessoa.idade" placeholder="Idade">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
