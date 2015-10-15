package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.Toppings;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class Lechuga extends Toppings {
        Pozole pozole;

        public Lechuga(Pozole pozole)
        {
            this.pozole = pozole;
            this.name = pozole.getName() + getDescription();
            this.broth = pozole.broth;

            pozole.toppings.add("Lechuga");
            this.toppings = pozole.toppings;
        }

        @Override
        public String getDescription() {
            return " with some lechuga";
        }
    }