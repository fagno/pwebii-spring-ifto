
package com.mycompany.projetoexemplo.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fagno
 */
public class JpaUtil {
      
    /**
     * atributo EntityManagerFactory para criar o EntityManager
     */
    private static EntityManagerFactory factory = null;

    
    /**
     * Método que é executado no start da aplicação
     * Persistence.createEntityManagerFactory(): Cria o EntityManagerFactory para criar o EntityManager
     */
    static {
        factory = Persistence.createEntityManagerFactory("aulawebii");
    }

    /**
     * Método que cria um EntityManager
     * @return EntityManager
     */
    public static EntityManager criarEntityManager() {
        return factory.createEntityManager();
    }

    /**
     * Fecha a conexão
     */
    public static void close() {
        factory.close();
    }
        
}