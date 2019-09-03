
package org.lasencinas.fastbreak.behavior;

import org.lasencinas.fastbreak.Desayuno;
import org.lasencinas.fastbreak.domain.Eyeholes;
import org.lasencinas.fastbreak.domain.FleebJuice;
import org.lasencinas.fastbreak.domain.Plumbus;
import org.lasencinas.fastbreak.domain.Smiggles;
import org.lasencinas.fastbreak.domain.TurbulentJuice;


public class FastBreakTruck {

    public static void incluirJuguete(Desayuno desayuno) {
        desayuno.addItem(new Plumbus());
    }
    
    
    
    
    public FastBreakTruck() {
        
    }
    
    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }
    
    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }
    
    
}
