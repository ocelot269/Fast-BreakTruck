/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.types.Bebida;

/**
 *
 * @author ozeh
 */
public class TurbulentJuice extends Bebida{
    String nombre = "Turbulent Juiceeeeee";
    Float pvp = 30.0f;

    public TurbulentJuice() {
    }

    @Override
    public String nombre() {
        return this.nombre; 
    }

    @Override
    public Packing empaquetado() {
        return super.empaquetado(); 
    }

    @Override
    public Float pvp() {
        return this.pvp;
    }
    
   
    
    
}
