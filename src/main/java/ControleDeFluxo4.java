public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(++contador);
        }
        do{
            System.out.println("Dentro do do while");
        }while(contador < 10);

        for(int i=0; i<10; i++){
            System.out.println("Valor de i e: "+i);
        }
    }
}
