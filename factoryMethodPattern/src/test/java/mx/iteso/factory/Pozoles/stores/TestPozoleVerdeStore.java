package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozoleVerdeStore {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Before
    public void inicio()
    {
        pozoleStore = new PozoleVerdeStore();
    }

    @Test
    public void TestpozoleVerdePollo()
    {
        pozole = pozoleStore.orderPozole("Verde", "pollo");
        assertEquals(pozole.getName(), "Pozole Verde con Pollo");
    }

    @Test
    public void TestpozoleVerdeCachete()
    {
        pozole = pozoleStore.orderPozole("Verde", "cachete");
        assertEquals(pozole.getName(), "Pozole Verde con Cachete");
    }
    @Test
    public void TestpozoleVerdeOreja()
    {
        pozole = pozoleStore.orderPozole("Verde", "oreja");
        assertEquals(pozole.getName(), "Pozole Verde con Oreja");
    }
    @Test
    public void TestpozoleVerdePierna()
    {
        pozole = pozoleStore.orderPozole("Verde", "pierna");
        assertEquals(pozole.getName(), "Pozole Verde con Pierna");
    }
    @Test
    public void TestpozoleVerdeTrompa()
    {
        pozole = pozoleStore.orderPozole("Verde", "trompa");
        assertEquals(pozole.getName(), "Pozole Verde con Trompa");
    }

    @Test
    public void TestpozoleVerdeCamaron()
    {
        pozole = pozoleStore.orderPozole("Verde", "camaron");
        assertEquals(pozole.getName(), "Pozole Verde con Camaron");
    }

    @Test(expected = NullPointerException.class)
    public void TestpozoleVerdeNull()
    {
        pozole = pozoleStore.orderPozole("Verde", "Perro");
        assertEquals(pozole.getName(), "Pozole Verde");
    }
}

