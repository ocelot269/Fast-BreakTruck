
package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Packing;


public class Tubo implements Packing{
      String nombre = "Tubo";
    @Override
    public String envoltorio() {
        return nombre;
    }
    
}
