
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;

public class Plumbus extends Juguete{
    String nombre = "Plumbus";
    Float pvp = 100.0f;
    
    @Override
    public Packing empaquetado() {
        return super.empaquetado(); //To change body of generated methods, choose Tools | Templates.
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
