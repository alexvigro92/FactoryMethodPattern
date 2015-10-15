package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoTrompa;
import mx.iteso.factory.pozoles.PozoleRojoTrompa;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleRojoTrompa {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleRojoTrompa();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole Rojo con Trompa");
    }
}