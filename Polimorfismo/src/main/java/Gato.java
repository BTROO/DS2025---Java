public class Gato  implements Animal {

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
