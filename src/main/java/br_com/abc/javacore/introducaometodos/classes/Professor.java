package br_com.abc.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public int rg;
    public int cpf;

    public void imprime(){
        System.out.println("----------------------------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);
    }


}
