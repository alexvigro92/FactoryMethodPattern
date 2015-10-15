package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleRojoStore {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void inicio()
    {
        pozoleStore = new PozoleRojoStore();
    }

    @Test
    public void TestpozoleRojoPollo()
    {
        pozole = pozoleStore.orderPozole("Rojo", "pollo");
        assertEquals(pozole.getName(), "Pozole Rojo con Pollo");
    }

    @Test
    public void TestpozoleRojoCachete()
    {
        pozole = pozoleStore.orderPozole("Rojo", "cachete");
        assertEquals(pozole.getName(), "Pozole Rojo con Cachete");
    }
    @Test
    public void TestpozoleRojoOreja()
    {
        pozole = pozoleStore.orderPozole("Rojo", "oreja");
        assertEquals(pozole.getName(), "Pozole Rojo con Oreja");
    }
    @Test
    public void TestpozoleRojoPierna()
    {
        pozole = pozoleStore.orderPozole("Rojo", "pierna");
        assertEquals(pozole.getName(), "Pozole Rojo con Pierna");
    }
    @Test
    public void TestpozoleRojoTrompa()
    {
        pozole = pozoleStore.orderPozole("Rojo", "trompa");
        assertEquals(pozole.getName(), "Pozole Rojo con Trompa");
    }

    @Test
    public void TestpozoleRojoCamaron()
    {
        pozole = pozoleStore.orderPozole("Rojo", "camaron");
        assertEquals(pozole.getName(), "Pozole Rojo con Camaron");
    }

    @Test(expected = NullPointerException.class)
    public void TestpozoleRojoNull()
    {
        pozole = pozoleStore.orderPozole("Rojo", "Perro");
        assertEquals(pozole.getName(), "Pozole Rojo");
    }
}

