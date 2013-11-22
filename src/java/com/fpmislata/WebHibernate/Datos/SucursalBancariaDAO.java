/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import com.fpmislata.WebHibernate.Negocio.SucursalBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface SucursalBancariaDAO extends GenericDAO<SucursalBancaria,Integer> {

    List<SucursalBancaria> findByCodigo(Integer id);
   
}
