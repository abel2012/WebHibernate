/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    
     private int idCuentaBancaria;
    private SucursalBancaria sucursalBancaria;
    private String numeroCuenta;
    private String dc;
    private BigDecimal saldo;
    private String cif;
     private List<MovimientoBancario> movimiento= new ArrayList<>();
    
    public CuentaBancaria(){}
    
    public CuentaBancaria(int idCuentaBancaria,SucursalBancaria sucursalBancaria,String numeroCuenta,String dc,BigDecimal saldo,String cif ){
    
    this.idCuentaBancaria=idCuentaBancaria;
    this.sucursalBancaria=sucursalBancaria;
    this.numeroCuenta=numeroCuenta;
    this.dc=dc;
    this.saldo=saldo;
    this.cif=cif;
    
    }

    /**
     * @return the idCuentaBancaria
     */
    

    /**
     * @return the sucursalBancaria
     */
    public SucursalBancaria getSucursalBancaria() {
        return sucursalBancaria;
    }

    /**
     * @param sucursalBancaria the sucursalBancaria to set
     */
    public void setSucursalBancaria(SucursalBancaria sucursalBancaria) {
        this.sucursalBancaria = sucursalBancaria;
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the dc
     */
    public String getDc() {
        return dc;
    }

    /**
     * @param dc the dc to set
     */
    public void setDc(String dc) {
        this.dc = dc;
    }

    /**
     * @return the saldo
     */
    
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
     * @return the idCuentaBancaria
     */
    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    /**
     * @param idCuentaBancaria the idCuentaBancaria to set
     */
    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the movimiento
     */
    public List<MovimientoBancario> getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(List<MovimientoBancario> movimiento) {
        this.movimiento = movimiento;
    }

    /**
     * @return the saldo
     */
    

    /**
     * @return the saldo
     */
    
    
}
