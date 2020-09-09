
package com.mycompany.projetoexemplo.model.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static void main(String[] args) {
        //testar conexão
        System.out.println(Conexao.criarConexao());
    }
    
    
    /**
     * método estático que retorna uma conexão
     */
    public static Connection criarConexao(){
        try {
            //carregar o driver de conexão
            Class.forName("com.mysql.jdbc.Driver");
            //parâmetros
            String url = "jdbc:mysql://localhost:3306/banco";
            String usuario = "root";
            String senha = "senha";
            //retorna a conexão com o banco de dados
            return DriverManager.getConnection(url, usuario, senha);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
}
