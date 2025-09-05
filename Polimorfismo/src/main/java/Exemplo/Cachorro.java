package Exemplo;

public class Cachorro implements Animal {

    @Override
    public String emitirSom() {
        return "AUUU!";
    }

    @Override
    public String comer() {
        return "ração";
    }

    public static class Pato implements Animal {

        @Override
        public String emitirSom(){
            return "Qua!";
        }

        @Override
        public String comer() {
            return "pão!";

        }

    }
}
