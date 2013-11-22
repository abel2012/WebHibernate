/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import com.fpmislata.WebHibernate.Negocio.EntidadBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria, Integer> {
      List<EntidadBancaria> findByCodigo(String codigo);
      List<EntidadBancaria> findByName(String nombre);
}
