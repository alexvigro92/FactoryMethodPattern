package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeTrompa;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleVerdeTrompa {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleVerdeTrompa();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole Verde con Trompa");
    }
}