package org.lessons.java.farm;

public class Passerotto extends Animal implements Volante{
    @Override
    public void verso() {
        System.out.println("Cheep");
    }

    @Override
    public void mangia() {
        System.out.println("Meat or Grass");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando!!!");
    }
}