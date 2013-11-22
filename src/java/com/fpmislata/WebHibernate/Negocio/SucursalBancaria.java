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
public class SucursalBancaria {
    private int idSucursalBancaria;
    private EntidadBancaria entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    private List<CuentaBancaria> cuenta= new ArrayList<>();
    
    
    public SucursalBancaria(){}
    
    public SucursalBancaria(int idSucursalBancaria,EntidadBancaria entidadBancaria,String codigoSucursal,String nombre ){
    this.idSucursalBancaria=idSucursalBancaria;
    this.entidadBancaria=entidadBancaria;
    this.codigoSucursal=codigoSucursal;
    this.nombre=nombre;
    
    
    }

    /**
     * @return the idSucursalBancaria
     */
   

    /**
     * @return the entidadBancaria
     */
    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * @param entidadBancaria the entidadBancaria to set
     */
    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * @return the codigoSucursal
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * @param codigoSucursal the codigoSucursal to set
     */
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
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
     * @return the idSucursalBancaria
     */
    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    /**
     * @param idSucursalBancaria the idSucursalBancaria to set
     */
    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    /**
     * @return the cuenta
     */
    public List<CuentaBancaria> getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(List<CuentaBancaria> cuenta) {
        this.cuenta = cuenta;
    }
    
}
