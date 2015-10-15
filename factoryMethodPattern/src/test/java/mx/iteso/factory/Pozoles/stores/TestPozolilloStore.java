package mx.iteso.factory.Pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/14/2015.
 */
public class TestPozolilloStore {
    PozoleStore pozoleStore;
    @Test
    public void createPozoleTest()
    {
        pozoleStore = new PozolilloStore();
        Pozole pozole = pozoleStore.orderPozole("Pozolillo", "pollo");
        assertEquals(pozole.getName(), "Pozolillo");
    }


}
