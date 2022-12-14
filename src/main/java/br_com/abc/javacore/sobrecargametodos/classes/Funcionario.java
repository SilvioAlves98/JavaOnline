package br_com.abc.javacore.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getSalario());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}
