package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestMenudoStore {
    PozoleStore pozoleStore;
    @Test
    public void createPozoleTest()
    {
        pozoleStore = new MenudoStore();
        Pozole pozole = pozoleStore.orderPozole("Menudo", "pollo");
        assertEquals(pozole.getName(), "Menudo");
    }


}
