package br_com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    public Cliente(){
        System.out.println("Dentro do construtor");
        for (int parcela: this.parcelas){
            System.out.println(parcela + " ");
        }
    }


    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
