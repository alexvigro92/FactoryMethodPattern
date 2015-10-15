package mx.iteso.factory.Pozoles.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.Pozolillo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozolillo {
    Pozole pozolillo;

    @Before
    public void before()
    {
        pozolillo = new Pozolillo();
    }

    @Test
    public void TestSirviendo()
    {
        String served = pozolillo.serve();
        assertEquals("Serving a special pozolillo...", served);
    }
}
