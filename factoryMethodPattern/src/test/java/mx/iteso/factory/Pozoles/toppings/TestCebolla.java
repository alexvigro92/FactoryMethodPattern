package mx.iteso.factory.Pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoPollo;
import mx.iteso.factory.toppings.Cebolla;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestCebolla {
    @Test
    public void Testcebolla()
{
    Pozole cebolla = new PozoleBlancoPollo();
    cebolla = new Cebolla(cebolla);
    assertEquals(cebolla.getName(), "Pozole Blanco con Pollo with some cebolla" );
}


}