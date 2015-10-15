package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.Toppings;

/**
 * Created by mavg_ on 10/14/2015.
 */

public class Cebolla extends Toppings {
    Pozole pozole;

    public Cebolla(Pozole pozole)
    {
        this.pozole = pozole;
        this.name = pozole.getName() + getDescription();
        this.broth = pozole.broth;

        pozole.toppings.add("Cebolla");
        this.toppings = pozole.toppings;
    }

    @Override
    public String getDescription() {
        return " with some cebolla";
    }
}
