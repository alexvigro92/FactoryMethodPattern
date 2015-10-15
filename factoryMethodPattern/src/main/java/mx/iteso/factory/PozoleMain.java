package mx.iteso.factory;

import mx.iteso.factory.stores.*;
import mx.iteso.factory.toppings.Cebolla;
import mx.iteso.factory.toppings.Oregano;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        PozoleStore pozolilleria = new PozolilloStore();
        PozoleStore allPozoleria = new AllPozolesStore();

        Pozole pozole = verdeStore.orderPozole("Pozole Verde","pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("Pozole Rojo","camaron");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("Menudo","pierna");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = pozolilleria.orderPozole("pozolillo","pollo");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = allPozoleria.orderPozole("Pozole Verde", "camaron");
        System.out.println("Fourth order is: "+ pozole.getName());
        System.out.println();

        Pozole menudo = allPozoleria.orderPozole("Menudo","pierna");
        menudo = new Cebolla(menudo);
        menudo = new Oregano(menudo);
        System.out.println("Type of pozole: " + menudo.getName());
        System.out.println("Broth: " + menudo.broth);
        System.out.println("Toppings: " + menudo.toppings);

    }
}