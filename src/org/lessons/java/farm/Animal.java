package org.lessons.java.farm;

public abstract class Animal {

//    all'interno della classe astratta Animal creo i vari metodi richiesti dove:

    //    il metodo dormi() sara' un metodo normale in quanto comune a tutti gli animali
    public void dormi(){
        System.out.println("Zzzzz");
    }
//    e i metodi verso() e mangia() invece saranno specifici

    public abstract void verso();

    public abstract void mangia();




}