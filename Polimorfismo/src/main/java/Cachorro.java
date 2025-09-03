public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "AUUU!";
    }

    @Override
    public String comer() {
        return "ração";
    }
}
