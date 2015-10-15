package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class PozoleVerdeCamaron  extends Pozole {
    public PozoleVerdeCamaron() {
        name = "Pozole Verde con Camaron";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
