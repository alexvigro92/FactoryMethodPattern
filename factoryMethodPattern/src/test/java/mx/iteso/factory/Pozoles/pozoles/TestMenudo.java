package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Menudo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */

public class TestMenudo {
    Pozole menudo;

    @Before
    public void before()
    {
        menudo = new Menudo();
    }

    @Test
    public void TestSirviendo()
    {
        String served = menudo.serve();
        assertEquals("Serving xtra hot in special menudo plate...", served);
    }
}