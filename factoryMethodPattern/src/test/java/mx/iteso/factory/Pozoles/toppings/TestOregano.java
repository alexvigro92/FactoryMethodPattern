package mx.iteso.factory.Pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdePollo;
import mx.iteso.factory.toppings.Lechuga;
import mx.iteso.factory.toppings.Oregano;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestOregano {
    @Test
    public void TestOregano()
    {
        Pozole oregano = new PozoleVerdePollo();
        oregano = new Oregano(oregano);
        assertEquals(oregano.getName(), "Pozole Verde con Pollo with some oregano" );
    }


}