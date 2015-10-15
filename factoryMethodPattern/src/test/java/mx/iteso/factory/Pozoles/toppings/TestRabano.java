package mx.iteso.factory.Pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdePollo;
import mx.iteso.factory.toppings.Rabanos;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestRabano{
    @Test
    public void TestRabano()
    {
        Pozole rabano = new PozoleVerdePollo();
        rabano = new Rabanos(rabano);
        assertEquals(rabano.getName(), "Pozole Verde con Pollo with some rabanos" );
    }


}