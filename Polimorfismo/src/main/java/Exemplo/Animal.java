package Exemplo;

public interface Animal {
    public abstract String emitirSom();
    public abstract String comer();

    class Gato  implements Animal {

        public Gato() {
        }

        @Override
        public String emitirSom() {
            return "Miau";
        }

        @Override
        public String comer() {
            return "ração";
        }
    }
}
