/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

/**
 *
 * @author AndreaOrjuela
 */
public class Sillas {
    
    private String tipoSilla;
    private int fila;
    private int columna;
    private int valor;
    private int estado;

    public Sillas(String tipoSilla, int fila, int columna, int valor, int estado) {
        this.tipoSilla = tipoSilla;
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.estado = estado;
    }

    /**
     * 
     * Getter y Setters
     */
    
    public String getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(String tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
