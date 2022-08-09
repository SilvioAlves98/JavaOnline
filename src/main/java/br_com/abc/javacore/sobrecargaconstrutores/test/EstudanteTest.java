package br_com.abc.javacore.sobrecargaconstrutores.test;

import br_com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("121212", "Carlitos", new double[] {5, 7, 9});
        est.Imprime();
    }
}
