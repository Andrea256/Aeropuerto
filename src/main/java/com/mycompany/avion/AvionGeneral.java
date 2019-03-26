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
public class AvionGeneral extends Aviones{
    
    List<Sillas> listSillas = new ArrayList<>();
    
    private int estadoGen;

    public AvionGeneral(int estadoGen, int idAvion) {
        super(idAvion);
        this.estadoGen = estadoGen;
    }
    
    


    public List<Sillas> getListSillas() {
        return listSillas;
    }

    public void setListSillas(List<Sillas> listSillas) {
        this.listSillas = listSillas;
    }

    public int getEstadoGen() {
        return estadoGen;
    }

    public void setEstadoGen(int estadoGen) {
        this.estadoGen = estadoGen;
    }
    
    
}
