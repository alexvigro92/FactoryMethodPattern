package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class PozoleRojoCamaron  extends Pozole {
    public PozoleRojoCamaron() {
        name = "Pozole Rojo con Camaron";
        broth = "Caldo Rojo";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
