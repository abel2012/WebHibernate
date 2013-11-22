/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


/**
 *
 * @author alumno
 */
public class ConnectionFactoryImplDATASOURCE implements ConnectionFactory {

    @Override
    public Connection getConnection() {
        try {
            InitialContext initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource dataSource = (DataSource)envCtx.lookup("jdbc/banco");
           
            Connection connection = dataSource.getConnection();
            //connection.close();
            return connection;
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }




    }
}
