
package org.lasencinas.fastbreak.types;

import org.lasencinas.fastbreak.behavior.Item;
import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.domain.Caja;


public class Cereales implements Item{
    
    Caja caja = new Caja();
    
    public Cereales() {
    }

    @Override
    public Packing empaquetado() {
        return caja;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float pvp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
