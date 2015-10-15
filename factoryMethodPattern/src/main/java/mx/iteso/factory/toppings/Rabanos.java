package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.Toppings;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class Rabanos extends Toppings {
    Pozole pozole;

    public Rabanos(Pozole pozole)
    {
        this.pozole = pozole;
        this.name = pozole.getName() + getDescription();
        this.broth = pozole.broth;

        pozole.toppings.add("Rabanos");
        this.toppings = pozole.toppings;
    }

    @Override
    public String getDescription() {
        return " with some rabanos";
    }
}