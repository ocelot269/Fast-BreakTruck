package org.lasencinas.fastbreak.domain;

import org.lasencinas.fastbreak.behavior.Item;
import org.lasencinas.fastbreak.behavior.Packing;

public class Juguete implements Item {

    @Override
    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Packing empaquetado() {
        Caja caja = new Caja();
        return caja;
    }

    @Override
    public Float pvp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
