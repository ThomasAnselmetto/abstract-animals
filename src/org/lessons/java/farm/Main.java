package org.lessons.java.farm;

public class Main {
    public static void main(String[] args) {
//        creo un array degli animali
        Animal[] farm = new Animal[4];
        farm[0] = new Delfino();
        farm[1] = new Cane();
        farm[2] = new Aquila();
        farm[3] = new Passerotto();

//        ciclo gli animali nel mio array e li stampo a schermo
        for (int i = 0; i < farm.length; i++) {
            System.out.println((i + 1) + "° animale ---");
        }
    }
}