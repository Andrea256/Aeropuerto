/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AndreaOrjuela
 */
public class AvionVip extends Aviones{
    
    List<Sillas> listSillas = new ArrayList<>();
    
    private int estadoVip;

    public AvionVip(int estadoVip, int idAvion) {
        super(idAvion);
        this.estadoVip = estadoVip;
    }

    /**
     * 
     * @return 
     */
    
    public List<Sillas> getListSillas() {
        return listSillas;
    }

    public void setListSillas(List<Sillas> listSillas) {
        this.listSillas = listSillas;
    }

    public int getEstadoVip() {
        return estadoVip;
    }

    public void setEstadoVip(int estadoVip) {
        this.estadoVip = estadoVip;
    }

    
    
    
    

   
    
    
}
