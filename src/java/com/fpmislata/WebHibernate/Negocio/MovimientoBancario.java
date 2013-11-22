/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.WebHibernate.Negocio;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {

    private int idMovimientoBancario;
    private TipoMovimientoBancario tipoMovimientoBancario;
    private BigDecimal importe;
    private Date fecha;
    private BigDecimal saldoTotal;
    private String concepto;

    public MovimientoBancario() {
    }

    public MovimientoBancario(int idMovimientoBancario, TipoMovimientoBancario tipoMovimientoBancario, BigDecimal importe, Date fecha, BigDecimal saldoTotal, String concepto) {

        this.idMovimientoBancario = idMovimientoBancario;
        this.tipoMovimientoBancario = tipoMovimientoBancario;
        this.importe = importe;
        this.fecha = fecha;
        this.saldoTotal = saldoTotal;
        this.concepto = concepto;

    }

    /**
     * @return the idMovimientoBancario
     */
    /**
     * @return the tipoMovimientoBancario
     */
    public TipoMovimientoBancario getTipoMovimientoBancario() {
        return tipoMovimientoBancario;
    }

    /**
     * @param tipoMovimientoBancario the tipoMovimientoBancario to set
     */
    public void setTipoMovimientoBancario(TipoMovimientoBancario tipoMovimientoBancario) {
        this.tipoMovimientoBancario = tipoMovimientoBancario;
    }

    /**
     * @return the importe
     */
    

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the saldoTotal
     */
   

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the idMovimientoBancario
     */
    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    /**
     * @param idMovimientoBancario the idMovimientoBancario to set
     */
    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    /**
     * @return the importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    /**
     * @return the saldoTotal
     */
    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the importe
     */
    
    /**
     * @return the importe
     */
   

    /**
     * @return the saldoTotal
     */
   
}
