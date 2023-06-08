package org.lessons.java.farm;

public class Cane extends Animal implements Nuotante{
    @Override
    public void verso() {
        System.out.println("Bau Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Crocchette");
    }

//    segno solo sul cane per comodita', sugli animali che implementano una specifica interfaccia inserisco anche i o il metodo (in questo caso) che l'interfaccia possiede

    @Override
    public void nuota() {
        System.out.println("Sto Nuotando!!!");

    }
}