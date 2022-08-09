package br_com.abc.javacore.modificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprime(){
        System.out.println("----------------------------------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade maxima "+this.velocidadeMaxima);
        System.out.println("Velocidade limite "+this.velocidadeLimite);
    }
    public Carro(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocicadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocicadeMaxima(double velocicadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
