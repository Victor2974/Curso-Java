package exercicios.ex6;

import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //int tamanho = sc.nextInt();
        //int[] array = new int[tamanho];
        int[] array = {1,1,1,1};
        int tamanho = array.length;

        //for(int i=0;i<tamanho;i++){
        //     array[i] = sc.nextInt();
        //}

        int pares = 0;

        for(int i=0;i<tamanho-1;i++){
            int num = array[i];

            for(int g=i+1;g<tamanho;g++){
                if(num == array[g]){
                    pares++;
                }
            }

        }

        System.out.print("Pares perfeitos = "+pares);
        //sc.close();



    }
}
