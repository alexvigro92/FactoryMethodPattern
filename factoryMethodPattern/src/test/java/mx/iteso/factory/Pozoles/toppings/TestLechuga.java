package mx.iteso.factory.Pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdePollo;
import mx.iteso.factory.toppings.Lechuga;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestLechuga {
        @Test
        public void TestLechuga()
        {
            Pozole lechuga = new PozoleVerdePollo();
            lechuga = new Lechuga(lechuga);
            assertEquals(lechuga.getName(), "Pozole Verde con Pollo with some lechuga" );
        }


    }

