package br_com.abc.intruducao.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[] String = {1,2,3};
        int[] String2 = new int[3];
        int[] String3 = new int[] {1,2,3};

         // int[][] dias = new int[3][];
         //  dias [0] = new int[2];
         //  dias [1] = new int[]{1,2,3};
         // dias [2] = new int[4];

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
        // QUal o valor da posicao [1] [2] = 3

        for (int[] arr: dias){
            for (int num : arr){
                System.out.println(num );
            }
        }
    }
}
