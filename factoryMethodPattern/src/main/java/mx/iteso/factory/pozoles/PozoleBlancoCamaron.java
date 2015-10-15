package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class PozoleBlancoCamaron extends Pozole {
    public PozoleBlancoCamaron() {
        name = "Pozole Blanco con Camaron";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
