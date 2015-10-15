package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by mavg_ on 10/8/2015.
 */
public class AllPozolesStore extends PozoleStore{
    private MenudoStore menudoStore;
    private PozoleBlancoStore pozoleBlancoStore;
    private PozoleRojoStore pozoleRojoStore;
    private PozoleVerdeStore pozoleVerdeStore;
    private PozolilloStore pozolilloStore;

    public AllPozolesStore()
    {
        menudoStore = new MenudoStore();
        pozoleBlancoStore = new PozoleBlancoStore();
        pozoleRojoStore = new PozoleRojoStore();
        pozoleVerdeStore = new PozoleVerdeStore();
        pozolilloStore = new PozolilloStore();
    }

    @Override
    protected Pozole createPozole(String tipoPozole, String meat) {
        if (tipoPozole.equals("Menudo"))
            return menudoStore.createPozole("Menudo",meat);
        else if (tipoPozole.equals("Pozole Blanco"))
            return pozoleBlancoStore.createPozole("Pozole Blanco", meat);
        else if (tipoPozole.equals("Pozole Rojo"))
            return pozoleRojoStore.createPozole("Pozole Rojo", meat);
        else if (tipoPozole.equals("Pozole Verde"))
            return pozoleVerdeStore.createPozole("Pozole Verde",meat);
        else if (tipoPozole.equals("Pozolillo"))
            return pozolilloStore.createPozole("Pozolillo",meat);
        else
        return null;
    }
}
