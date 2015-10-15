package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by mavg_ on 10/8/2015.
 */
public class Pozolillo extends Pozole {
    public Pozolillo() {
        name = "Pozolillo";
        broth = "Caldo Rojo";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }

    @Override
    public String serve() {
        String sirviendo = "Serving a special pozolillo..." ;
        System.out.println(sirviendo );
        return sirviendo;
    }
}