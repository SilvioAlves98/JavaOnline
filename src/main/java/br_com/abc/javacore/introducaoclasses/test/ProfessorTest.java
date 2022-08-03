package br_com.abc.javacore.introducaoclasses.test;

import br_com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor Silvio = new Professor();
        Silvio.nome ="Silvio";
        Silvio.matricula = "121212";
        Silvio.rg = 123456789;
        Silvio.cpf = 987654321;

        System.out.println(Silvio.nome);
        System.out.println(Silvio.matricula);
        System.out.println(Silvio.rg);
        System.out.println(Silvio.cpf);
    }
}
