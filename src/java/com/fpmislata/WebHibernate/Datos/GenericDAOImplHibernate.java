/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Datos;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author familiape
 */
public class GenericDAOImplHibernate<T, ID extends Serializable> implements GenericDAO<T, ID> {

    SessionFactory sessionFactory;
    private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());

    public GenericDAOImplHibernate() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public T read(ID id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.get(getEntityClass(), id);
            session.getTransaction().commit();

            return entity;
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }

    @Override
    public void delete(ID id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.get(getEntityClass(), id);
            if (entity == null) {
                try {
                } catch (Exception e) {
                    RuntimeException re = new RuntimeException(e);
                    throw re;

                }
            }
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }

    @Override
    public List<T> findAll() {
        Session session = sessionFactory.getCurrentSession();
        try {

            Query query = session.createQuery("SELECT e FROM " + getEntityClass().getName() + " e");
            List<T> entities = query.list();

            return entities;
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }

        public List<T> findByCodigo(String codigo) {
        Session session = sessionFactory.getCurrentSession();
        try {

            Query query = session.createQuery("SELECT e FROM EntidadBancaria e where codigoEntidad='" + codigo + "' ");
            List<T> entities = query.list();

            return entities;
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }

        public List<T> findByName(String nombre) {
        Session session = sessionFactory.getCurrentSession();
        try {

            Query query = session.createQuery("SELECT e FROM EntidadBancaria e where nombre='" + nombre + "'");
            List<T> entities = query.list();

            return entities;
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }
    
    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public void update(T entity) {
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        }
        catch(Exception e){
         try {
                  if (session.getTransaction().isActive()) {
                      session.getTransaction().rollback();
                 }
             } catch (Exception exc) {
                  LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
              }
         RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }

    @Override
    public void insert(T t) {
         Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();
        }
        catch(Exception e){
         try {
                  if (session.getTransaction().isActive()) {
                      session.getTransaction().rollback();
                 }
             } catch (Exception exc) {
                  LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
              }
         RuntimeException re = new RuntimeException(e);
            throw re;
        }
    }
}
