package br_com.abc.javacore.introducaometodos.test;

import br_com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Silvio");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3,2,5});
        estudante.print();
        estudante.tirarMedia();
    }
}
