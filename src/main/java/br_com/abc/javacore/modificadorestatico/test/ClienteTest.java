package br_com.abc.javacore.modificadorestatico.test;


import br_com.abc.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis");
        for (int parcela: c.getParcelas()){
            System.out.println(parcela + " ");
        }
    }
}
