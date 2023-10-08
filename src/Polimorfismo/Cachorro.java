package Polimorfismo;

import java.util.Objects;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Au!Au!");
    }
    public void reagir(String frase){
        if (Objects.equals(frase, "Comida") || Objects.equals(frase, "Olá")){
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }

    }
    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Abanar e latir");

        } else {
            System.out.println("Ignorar");
        }

    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar");
        }

    }
}
