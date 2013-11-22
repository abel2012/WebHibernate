/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface GenericDAO<T,ID extends Serializable>{
      
    T read(ID id);
    void insert(T t);
    void update(T t);
    void delete(ID id);
    List<T> findAll();
    
}
