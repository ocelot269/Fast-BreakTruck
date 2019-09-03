
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;


public class Caja implements Packing{
    
    String nombre = "Caja";
    
    public Caja() {
    }
    
    @Override
    public String envoltorio() {
       return getNombre();
    }
    
    public String getNombre() {
        return nombre;
    }
    
}
