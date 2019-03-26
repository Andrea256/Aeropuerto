/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.Date;

/**
 *
 * @author AndreaOrjuela
 */
public class Usuario {
    
    
    private int identUsu;
    private String nombreUsu;
    private Date fechaNacimiento;

    public Usuario(int identUsu, String nombreUsu, Date fechaNacimiento) {
        this.identUsu = identUsu;
        this.nombreUsu = nombreUsu;
        this.fechaNacimiento = fechaNacimiento;
    }

    

    /**
     * 
     * @return 
     */
    
    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public int getIdentUsu() {
        return identUsu;
    }

    public void setIdentUsu(int identUsu) {
        this.identUsu = identUsu;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
