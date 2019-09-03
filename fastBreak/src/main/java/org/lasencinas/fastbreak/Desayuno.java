
package org.lasencinas.fastbreak;

import java.util.ArrayList;
import java.util.List;
import org.lasencinas.fastbreak.behavior.Item;


public class Desayuno {
    
    private List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
        return this.items;
    }
    
    public Desayuno(){
    }
    
    
    public void addItem(Item item){
        getItems().add(item);
    }
    
    public void mostrarItems(){
        for (Item item : getItems()) {
            System.out.println("Item : " + item.nombre() + 
                    ", Empaquetado: " + item.empaquetado().envoltorio() + ", Precio: " + item.pvp());
        }
    }
    public Float getCoste() {
        float precioTotal = 0f;
        for (Item item : getItems()) {
            precioTotal += item.pvp();
        }
        return precioTotal;
    }
}
