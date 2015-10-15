package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestAllPozolesStore {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void setUo()
    {
        pozoleStore = new AllPozolesStore();
    }

    @Test
    public void TestMenudo()
    {
        pozole = pozoleStore.orderPozole("Menudo", "pollo");
        assertEquals(pozole.getName(), "Menudo");
    }

    @Test
    public void TestpozoleBlancoOreja() {
        pozole = pozoleStore.orderPozole("Pozole Blanco", "oreja");
        assertEquals(pozole.getName(), "Pozole Blanco con Oreja");
    }

    @Test
    public void TestpozoleRojoCamaron()
    {
        pozole = pozoleStore.orderPozole("Pozole Rojo", "camaron");
        assertEquals(pozole.getName(), "Pozole Rojo con Camaron");
    }

    @Test
    public void TestpozoleVerdeCachete()
    {
        pozole = pozoleStore.orderPozole("Pozole Verde", "cachete");
        assertEquals(pozole.getName(), "Pozole Verde con Cachete");
    }

    @Test
    public void pozolilloTest()
    {
        pozole = pozoleStore.orderPozole("Pozolillo", "pierna");
        assertEquals(pozole.getName(), "Pozolillo");
    }

    @Test(expected = NullPointerException.class)
    public void TestpozoleRojoNull()
    {
        pozole = pozoleStore.orderPozole("Pozole Rojo", "cabra");
        assertEquals(pozole.getName(), "Pozole Rojo con cabra");
    }
}

