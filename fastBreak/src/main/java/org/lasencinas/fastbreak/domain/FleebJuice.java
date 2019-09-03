
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.types.Bebida;


public class FleebJuice extends Bebida{
    
    String nombre = "Fleeb juice";
    Float pvp = 35.0f;


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
