package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoPierna;
import mx.iteso.factory.pozoles.PozoleVerdePierna;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleVerdePierna {
    Pozole pozole;

    @Before
    public void setUp()
    {
        pozole = new PozoleVerdePierna();
    }

    @Test
    public void pozoleBlancoTest()
    {
        assertEquals(pozole.getName(), "Pozole Verde con Pierna");
    }
}

