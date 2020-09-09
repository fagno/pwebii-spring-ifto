
package com.mycompany.projetoexemplo.controller;

import br.com.caelum.vraptor.Controller;
import com.mycompany.projetoexemplo.dao.PessoaDao;
import com.mycompany.projetoexemplo.model.Pessoa;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author fagno
 */
@Controller
public class PessoasController{
    
    @Inject
    PessoaDAO dao;
    
    public List<Pessoa> lista(){
        return dao.pessoas();
    }   
  
    
}
