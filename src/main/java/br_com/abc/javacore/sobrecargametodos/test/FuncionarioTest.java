package br_com.abc.javacore.sobrecargametodos.test;

import br_com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Silvio");
        funcionario.init("Xica da silva", "111-222-333-44", 4500);

       funcionario.imprime();
    }
}
