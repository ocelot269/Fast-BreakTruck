
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;
import org.lasencinas.fastbreak.types.Cereales;


public class Smiggles extends Cereales{
    String nombre = "Smiggles";
    Float pvp = 50.0f;

    public Smiggles() {
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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPvp() {
        return pvp;
    }
}
