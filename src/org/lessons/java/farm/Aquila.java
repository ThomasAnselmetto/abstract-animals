package org.lessons.java.farm;

public class Aquila extends Animal implements Volante{
    @Override
    public void verso() {
        System.out.println("Eagle Tweet");
    }

    @Override
    public void mangia() {
        System.out.println("Meat");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando!!!");
    }
}