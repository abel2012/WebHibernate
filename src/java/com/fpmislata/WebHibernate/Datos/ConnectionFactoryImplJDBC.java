/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class ConnectionFactoryImplJDBC implements ConnectionFactory {

   Connection connection;
  
 

   @Override
        public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactoryImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/banco", "banco", "banco");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactoryImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
        
    }
  

    
}
