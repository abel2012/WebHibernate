/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import com.fpmislata.WebHibernate.Negocio.CuentaBancaria;
import com.fpmislata.WebHibernate.Negocio.EntidadBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface CuentaBancariaDAO extends GenericDAO<CuentaBancaria,Integer> {

    List<CuentaBancaria> findByCodigo(Integer id);
   
}
