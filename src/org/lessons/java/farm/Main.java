package org.lessons.java.farm;

public class Main {
//    creo i due metodi static per averli a disposizione per animali volanti e che nuotano
    public static void faiVolare(Volante animale) {
        animale.vola();
    }
    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }
    public static void main(String[] args) {
//        creo un array degli animali
        Animal[] farm = new Animal[4];
        farm[0] = new Delfino();
        farm[1] = new Cane();
        farm[2] = new Aquila();
        farm[3] = new Passerotto();

//        ciclo gli animali nel mio array e li stampo a schermo
        for (int i = 0; i < farm.length; i++) {
            System.out.println((i + 1) + "° animale");
//            getClass() metodo che restituisce il nome della classe o l'interfaccia rappresentata da un oggetto
            System.out.println("Classe: " + farm[i].getClass().getSimpleName());
            System.out.print("Nanna: ");
            farm[i].dormi();
            System.out.print("Cibo: ");
            farm[i].mangia();
            System.out.print("Verso: ");
            farm[i].verso();
            if (farm[i] instanceof Volante){
//                notare che i metodi static cambiano font per evidenziare la loro natura
                faiVolare((Volante)farm[i]);
            }else{
                faiNuotare((Nuotante)farm[i]);
            }
        }
    }
}