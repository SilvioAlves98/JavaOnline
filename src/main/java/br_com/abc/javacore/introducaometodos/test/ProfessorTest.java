package br_com.abc.javacore.introducaometodos.test;

import br_com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = 122222222;
        prof.matricula = "1233445553";
        prof.nome= "Marcos";
        prof.rg = 1122344;

        prof.imprime();





    }
}
