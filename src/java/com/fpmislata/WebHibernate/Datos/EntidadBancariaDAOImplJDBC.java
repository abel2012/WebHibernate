/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import com.fpmislata.WebHibernate.Negocio.EntidadBancaria;
import com.fpmislata.WebHibernate.Negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImplJDBC implements com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO {

    com.fpmislata.WebHibernate.Datos.ConnectionFactory connectionFactory = new com.fpmislata.WebHibernate.Datos.ConnectionFactoryImplDATASOURCE();

    /*List<EntidadBancaria> findByCodigo(String "45629866")
     {return null;};*/
    public EntidadBancariaDAOImplJDBC() {
    }

    @Override
    public EntidadBancaria read(Integer idEntidad) {

        try {
            EntidadBancaria entidadBancaria = new EntidadBancaria();
            Connection connection = connectionFactory.getConnection();


            //int idEntidadBancaria = 1;
            String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidad = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, idEntidad);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next() == true) {

                idEntidad = rs.getInt("idEntidad");
                String codigoEntidad = rs.getString("codigoEntidad");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

                entidadBancaria.setIdEntidadBancaria(idEntidad);
                entidadBancaria.setCodigoEntidad(codigoEntidad);
                entidadBancaria.setNombre(nombre);
                entidadBancaria.setCif(cif);

                if (tipoEntidadBancaria == null) {
                    entidadBancaria.setTipoEntidadBancaria(null);
                } else {
                    entidadBancaria.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                }


                if (rs.next() == true) {
                    throw new RuntimeException("Existe otro registro con el mismo id" + idEntidad);
                }


            } else {
                RuntimeException runtimeException = new RuntimeException("No existe este registro" + idEntidad);
                throw runtimeException;
            }


            connection.close();
            return entidadBancaria;
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }

    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {
        try {

            Connection connection = connectionFactory.getConnection();
            String insertTableSQL = "INSERT INTO entidadbancaria"
                    + "(idEntidad, codigoEntidad, nombre, cif,tipoEntidadBancaria) VALUES"
                    + "(?,?,?,?,?)";
            PreparedStatement preparedStatement2 = connection.prepareStatement(insertTableSQL);
            preparedStatement2.setInt(1, entidadBancaria.getIdEntidadBancaria());
            preparedStatement2.setString(2, entidadBancaria.getCodigoEntidad());
            preparedStatement2.setString(3, entidadBancaria.getNombre());
            preparedStatement2.setString(4, entidadBancaria.getCif());
            //preparedStatement2.setString(5, entidadBancaria.getTipoEntidadBancaria().name());


            if (entidadBancaria.getTipoEntidadBancaria() == null) {
                preparedStatement2.setString(5, null);
            } else {
                preparedStatement2.setString(5, entidadBancaria.getTipoEntidadBancaria().name());
            }
// execute insert SQL stetement
            preparedStatement2.executeUpdate();
            connection.close();
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }



    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {
        try {
            Connection connection = connectionFactory.getConnection();
            String updateTableSQL = "UPDATE entidadbancaria SET codigoEntidad=?,nombre= ?,cif=?  WHERE idEntidad= ?";
            PreparedStatement preparedStatement3 = connection.prepareStatement(updateTableSQL);
            preparedStatement3.setString(1, entidadBancaria.getCodigoEntidad());
            preparedStatement3.setString(2, entidadBancaria.getNombre());
            preparedStatement3.setString(3, entidadBancaria.getCif());
            preparedStatement3.setInt(4, entidadBancaria.getIdEntidadBancaria());
// execute insert SQL stetement
            preparedStatement3.executeUpdate();
            connection.close();
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }

    }

    @Override
    public void delete(Integer idEntidadBancaria) {
        try {
            Connection connection = connectionFactory.getConnection();
            PreparedStatement preparedStatement = null;
            try {
                String deleteSQL = "DELETE  FROM entidadbancaria WHERE idEntidad=?";
                preparedStatement = connection.prepareStatement(deleteSQL);
                preparedStatement.setInt(1, idEntidadBancaria);
// execute delete SQL stetement
                preparedStatement.executeUpdate();


            } catch (SQLException e) {
                SQLException re = new SQLException(e);
                throw re;


            } finally {

                if (preparedStatement != null) {
                    preparedStatement.close();
                }

                if (connection != null) {
                    connection.close();
                }

            }
            connection.close();
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }

    }

    @Override
    public List<EntidadBancaria> findAll() {
        try {
            Connection connection = connectionFactory.getConnection();

            List<EntidadBancaria> Entidades = new ArrayList<>();
            String selectSQL = "SELECT * FROM entidadbancaria";

            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int idEntidad = rs.getInt("idEntidad");
                String codigoEntidad = rs.getString("codigoEntidad");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");


                EntidadBancaria entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidadBancaria(idEntidad);
                entidadBancaria.setCodigoEntidad(codigoEntidad);
                entidadBancaria.setNombre(nombre);
                entidadBancaria.setCif(cif);

                if (tipoEntidadBancaria == null) {
                    entidadBancaria.setTipoEntidadBancaria(null);
                } else {
                    entidadBancaria.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                }


                Entidades.add(entidadBancaria);

                //Entidades.toArray();

            }

            connection.close();
            return Entidades;
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }


    }

    @Override
    public List<EntidadBancaria> findByCodigo(String codigo) {
        try {
            Connection connection = connectionFactory.getConnection();
            List<EntidadBancaria> Entidades = new ArrayList<>();
            String selectSQL = "SELECT * FROM entidadbancaria WHERE codigoEntidad=?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, codigo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int idEntidad = rs.getInt("idEntidad");
                String codigoEntidad = rs.getString("codigoEntidad");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");



                EntidadBancaria entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidadBancaria(idEntidad);
                entidadBancaria.setCodigoEntidad(codigoEntidad);
                entidadBancaria.setNombre(nombre);
                entidadBancaria.setCif(cif);

                if (tipoEntidadBancaria == null) {
                    entidadBancaria.setTipoEntidadBancaria(null);
                } else {
                    entidadBancaria.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                }

                Entidades.add(entidadBancaria);
            }


            connection.close();
            return Entidades;
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }


    }

    @Override
    public List<EntidadBancaria> findByName(String nombre1) {
         try {
            Connection connection = connectionFactory.getConnection();
            List<EntidadBancaria> Entidades = new ArrayList<>();
            String selectSQL = "SELECT * FROM entidadbancaria WHERE codigoEntidad=?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, nombre1);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int idEntidad = rs.getInt("idEntidad");
                String codigoEntidad = rs.getString("codigoEntidad");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");



                EntidadBancaria entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidadBancaria(idEntidad);
                entidadBancaria.setCodigoEntidad(codigoEntidad);
                entidadBancaria.setNombre(nombre);
                entidadBancaria.setCif(cif);

                if (tipoEntidadBancaria == null) {
                    entidadBancaria.setTipoEntidadBancaria(null);
                } else {
                    entidadBancaria.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                }

                Entidades.add(entidadBancaria);
            }


            connection.close();
            return Entidades;
        } catch (Exception e) {
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }
}
