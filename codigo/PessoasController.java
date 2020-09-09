package com.mycompany.projetoexemplo.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import com.mycompany.projetoexemplo.model.dao.PessoaDao;
import com.mycompany.projetoexemplo.model.Pessoa;
import java.util.List;

@Controller
public class PessoasController {

    PessoaDAO dao = new PessoaDAO();

    /**
     * Método para carregar o form.jsp
     */
    public void form() {
    }

    /**
     * Método para gramar uma pessoa no banco
     * @param pessoa
     * @param result 
     */
    public void salvar(Pessoa pessoa, Result result) {

        //Condicional necessária por que estamos utilizando o form.jsp para adicionar e atualizar uma Pessoa.
        if (pessoa.getId() == null) {
            dao.salvar(pessoa);
        } else {
            dao.update(pessoa);
        }
        //Redireciona e executa o método list()
        result.redirectTo(this).lista();
    }
    
    public void excluir(int id, Result result){
        dao.excluir(id);
        result.redirectTo(this).lista();
    }

    public void editar(int id, Result result) {
        Pessoa encontrado = dao.buscarPessoa(id);
        result.include(encontrado);
        //redireciona mas não executa o método form()
        result.of(this).form();
    }

    public List<Pessoa> lista() {
        return dao.buscarPessoas();
    }

}

