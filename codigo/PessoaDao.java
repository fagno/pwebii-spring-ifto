package com.mycompany.projetoexemplo.model.dao;

import com.mycompany.projetoexemplo.model.Pessoa;
import javax.persistence.EntityManager;

/**
 *
 * @author fagno
 */
public class PessoaDao{

    EntityManager em = JpaUtil.criarEntityManager();
    
    public void salvar(Pessoa pessoa){
        //inicia a transação
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }
    
    public Pessoa pessoa(int id){
        return em.find(Pessoa.class, id);
    }
    
    public List<Pessoa> Pessoas(){
        Query query = em.createQuery("from Pessoa");
        return query.getResultList();
    } 

    public void remove(Pessoa pessoa){
        em.getTransaction().begin();
        Pessoa p = em.find(Pessoa.class, pessoa.getId());
        em.remove(p);
        em.getTransaction().commit();
    }

    public void update(Pessoa pessoa){
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
    }


}
