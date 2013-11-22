/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
    
    private int idEntidadBancaria;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    private List<SucursalBancaria> sucursales= new ArrayList<>();
    
    public EntidadBancaria(){}

    public EntidadBancaria(int idEntidadBancaria,String codigoEntidad,String nombre,String cif,TipoEntidadBancaria tipoEntidadBancaria){
    
        this.idEntidadBancaria=idEntidadBancaria;
        this.codigoEntidad=codigoEntidad;
        this.nombre=nombre;
        this.cif=cif;
        this.tipoEntidadBancaria=tipoEntidadBancaria;
    }
    
    /**
     * @return the idEntidad
     */
    

    /**
     * @return the codigoEntidad
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the tipoEntidadBancaria
     */
    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    /**
     * @param tipoEntidadBancaria the tipoEntidadBancaria to set
     */
    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }

    /**
     * @return the idEntidadBancaria
     */
    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    /**
     * @param idEntidadBancaria the idEntidadBancaria to set
     */
    public void setIdEntidadBancaria(int idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }

    /**
     * @return the sucursales
     */
    public List<SucursalBancaria> getSucursales() {
        return sucursales;
    }

    /**
     * @param sucursales the sucursales to set
     */
    public void setSucursales(List<SucursalBancaria> sucursales) {
        this.sucursales = sucursales;
    }

    /**
     * @return the idEntidadBancaria
     */
    
    
    
            
}
