package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleBlancoStore {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void inicio()
    {
        pozoleStore = new PozoleBlancoStore();
    }

    @Test
    public void TestpozoleBlancoPollo()
    {
        pozole = pozoleStore.orderPozole("Blanco", "pollo");
        assertEquals(pozole.getName(), "Pozole Blanco con Pollo");
    }

    @Test
    public void TestpozoleBlancoCachete()
    {
        pozole = pozoleStore.orderPozole("Blanco", "cachete");
        assertEquals(pozole.getName(), "Pozole Blanco con Cachete");
    }
    @Test
    public void TestpozoleBlancoOreja()
    {
        pozole = pozoleStore.orderPozole("Blanco", "oreja");
        assertEquals(pozole.getName(), "Pozole Blanco con Oreja");
    }
    @Test
    public void TestpozoleBlancoPierna()
    {
        pozole = pozoleStore.orderPozole("Blanco", "pierna");
        assertEquals(pozole.getName(), "Pozole Blanco con Pierna");
    }
    @Test
    public void TestpozoleBlancoTrompa()
    {
        pozole = pozoleStore.orderPozole("Blanco", "trompa");
        assertEquals(pozole.getName(), "Pozole Blanco con Trompa");
    }

    @Test
    public void TestpozoleBlancoCamaron()
    {
        pozole = pozoleStore.orderPozole("Blanco", "camaron");
        assertEquals(pozole.getName(), "Pozole Blanco con Camaron");
    }

    @Test(expected = NullPointerException.class)
    public void TestpozoleBlancoNull()
    {
        pozole = pozoleStore.orderPozole("Blanco", "Perro");
        assertEquals(pozole.getName(), "Pozole blanco");
    }
}

