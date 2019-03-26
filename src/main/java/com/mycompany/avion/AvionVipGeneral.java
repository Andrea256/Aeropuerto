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
public class AvionVipGeneral extends Aviones{
    
    List<Sillas> listSillas = new ArrayList<>();
    
    private int estadoVipGen;

    public AvionVipGeneral(int estadoVipGen, int idAvion) {
        super(idAvion);
        this.estadoVipGen = estadoVipGen;
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

    public int getEstadoVipGen() {
        return estadoVipGen;
    }

    public void setEstadoVipGen(int estadoVipGen) {
        this.estadoVipGen = estadoVipGen;
    }

    
}
