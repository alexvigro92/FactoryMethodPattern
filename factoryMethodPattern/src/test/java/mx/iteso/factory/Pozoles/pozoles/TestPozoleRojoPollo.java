package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoPollo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleRojoPollo {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleRojoPollo();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole Rojo con Pollo");
    }
}