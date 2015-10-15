package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class Menudo extends Pozole {
    public Menudo() {
        name = "Menudo";
        broth = "Caldo Rojo";
    }

    @Override
    public String serve() {
        String sirviendo = "Serving xtra hot in special menudo plate..." ;
        System.out.println(sirviendo );
        return sirviendo;
    }
}
