package org.example.Atividade2;

public class Veiculo {
    String placa;
    String cor;
    int numeroPassageiros;
    double capacidadeTanque;
    double velocidadeMaxima;
    double consumoMedio;

    public Veiculo(String placa, String cor, int numeroPassageiros, double capacidadeTanque, double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" + '\n' +
                " Placa = " + placa + '\n' +
                " cor = " + cor + '\n' +
                " numeroPassageiros = " + numeroPassageiros + '\n' +
                " capacidadeTanque = " + capacidadeTanque + '\n' +
                " velocidadeMaxima ="  + velocidadeMaxima + '\n' +
                " consumoMedio = " + consumoMedio + '\n' +
                '}';
    }
}
