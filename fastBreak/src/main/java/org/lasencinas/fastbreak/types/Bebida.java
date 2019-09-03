/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.fastbreak.types;

import org.lasencinas.fastbreak.behavior.Item;
import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.domain.Tubo;

/**
 *
 * @author ozeh
 */
public class Bebida implements Item{
    
    
    Tubo tubo = new Tubo();
    
    @Override
    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Packing empaquetado() {
        return tubo;
    }

    @Override
    public Float pvp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
}
