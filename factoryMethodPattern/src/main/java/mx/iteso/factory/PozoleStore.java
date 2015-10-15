package mx.iteso.factory;

public abstract class PozoleStore {

    public Pozole orderPozole(String tipoPozole,String meat){
        Pozole pozole;

        pozole = createPozole(tipoPozole,meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String tipoPozole,String meat);
}