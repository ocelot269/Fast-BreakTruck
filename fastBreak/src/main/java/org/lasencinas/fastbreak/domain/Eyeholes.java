
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.types.Cereales;


public class Eyeholes extends Cereales{
    
    String nombre = "Eyeholes";
    Float pvp = 25.0f;
    
    public Eyeholes() {
    }

    @Override
    public Packing empaquetado() {
        return super.empaquetado();
    }

    @Override
    public String nombre() {
        return getNombre(); 
    }

    @Override
    public Float pvp() {
        return getPvp();
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPvp() {
        return pvp;
    }

    
    
}
