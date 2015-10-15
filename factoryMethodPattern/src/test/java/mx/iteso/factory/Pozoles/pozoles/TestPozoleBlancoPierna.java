package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleBlancoPierna {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleBlancoPierna();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole Blanco con Pierna");
    }
}

