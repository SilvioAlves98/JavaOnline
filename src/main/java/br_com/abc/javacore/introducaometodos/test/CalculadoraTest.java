package br_com.abc.javacore.introducaometodos.test;

import br_com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        System.out.println("Divisao por dois numeros: ");
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("Imprime dois numeros: ");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("Continuando a execucao ");
    }
}
