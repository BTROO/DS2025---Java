package Exemplo;

public class Pato implements Animal {
        public Pato() {
        }

        @Override
        public String emitirSom(){
            return "QUA!";
        }
        @Override
        public String comer() {
            return "Pão!";

        }
    }
