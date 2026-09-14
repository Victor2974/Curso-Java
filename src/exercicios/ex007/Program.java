package exercicios.ex7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //int m = sc.nextInt();
        // n = sc.nextInt();

        //int[][] matriz = new int[m][n];
        int[][] matriz = {
                {10,8,15,12},
                {21,11,23,8},
                {14,5,13,19}
        };

        int target = sc.nextInt();

        for(int i=0;i< matriz.length;i++){

            for(int g=0;g<matriz[0].length;g++){

                    if(matriz[i][g] == target) {
                        System.out.printf("Postion %d,%d:%n", i, g);

                        if (g > 0) {
                            System.out.println("Left: " + matriz[i][g - 1]);
                        }
                        if (g+1 < matriz[i].length) {
                            System.out.println("Right: " + matriz[i][g + 1]);
                        }
                        if (i > 0) {
                            System.out.println("Up: " + matriz[i - 1][g]);
                        }
                        if (i + 1 < matriz.length) {
                            System.out.println("Down: " + matriz[i + 1][g]);
                        }
                        System.out.println();
                    }
            }
        }
        //System.out.println(Arrays.deepToString(matriz));
    }

}
