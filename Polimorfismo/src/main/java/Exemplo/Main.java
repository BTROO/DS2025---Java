package Exemplo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal.Gato gato = new Animal.Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
        System.out.println(pato.emitirSom());
        System.out.println(galo.emitirSom());
    }
}
