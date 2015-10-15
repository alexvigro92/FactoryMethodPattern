package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Pozolillo;

/**
 * Created by mavg_ on 10/8/2015.
 */
public class PozolilloStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String tipoPozole,String meat) {
        Pozole pozole = new Pozolillo();
        return pozole;
    }
}