package org.lessons.java.farm;

public class Delfino extends Animal implements Nuotante{
    @Override
    public void verso() {
        System.out.println("dolphin vocalizations");
    }

    @Override
    public void mangia() {
        System.out.println("Fish and plancton");
    }

    @Override
    public void nuota() {
        System.out.println("Sto Nuotando!!!");
    }
}