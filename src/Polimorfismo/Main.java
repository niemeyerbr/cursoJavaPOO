package Polimorfismo;

public class Main {
    public static void main(String[] args) {
       // Animal a1 = new Animal(); -> Classes abstratas nao podem ser instanciadas!
        Cachorro c1 = new Cachorro();
        c1.reagir("Olã");
        c1.reagir("Vai apanhar");
        c1.reagir(11,40);
        c1.reagir(21, 0);
        c1.reagir(true);
        c1.reagir(false);
        c1.emitirSom();
    }
}
